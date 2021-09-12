package tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
//thread 적용
class UserThread extends Thread{
	Socket socket;
	public UserThread(Socket socket) {
		this.socket = socket;
		System.out.println("접속ip: "+socket.getInetAddress());
		start(); //run실행
		
	}
	public void run() {
		String readData = null;
		InputStream input;
		
		try {
			while(true) {
				input = socket.getInputStream();
				DataInputStream dataInput = new DataInputStream(input);
				readData = dataInput.readUTF();
				System.out.println("수신 데이터 : "+readData);
				/*
				if(readData.equals("stop")) {
					System.out.println("서버 종료");
					dataInput.close(); socket.close();
				}
				*/
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Server03_thread {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(123);
		
		while(true) {
			System.out.println("접속 대기중");
			Socket socket = serverSocket.accept();
			new UserThread(socket);
		}
	}
}
