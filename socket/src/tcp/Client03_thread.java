package tcp;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client03_thread {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("localhost", 123);
		OutputStream output = socket.getOutputStream();
		DataOutputStream dataOutput = new DataOutputStream(output);
		
		while(true) {
			System.out.println("전송 데이터 입력: ");
			String data = new Scanner(System.in).next();
			dataOutput.writeUTF(data);
			System.out.println("전송 완료");
				
			if(data.equals("stop")) {
				System.out.println("종료");
				break;
			}
		}
		dataOutput.close(); socket.close(); output.close();
	}
}
