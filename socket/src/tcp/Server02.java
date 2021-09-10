package tcp;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket(1234);
		
		Socket socket = serverSocket.accept();
		System.out.println("접속 되었습니다.");
		
		InputStream input = socket.getInputStream();
		DataInputStream dataInput = new DataInputStream(input);
		String data = dataInput.readUTF(); 
		//readUTF:string형태 받아올때 한글이 안 깨지게 하기 위함
		
		System.out.println("수신 데이터: "+data);
		
		serverSocket.close(); socket.close(); dataInput.close();
		System.out.println("서버 종료");
	}
}
