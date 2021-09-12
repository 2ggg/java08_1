package tcp;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("localhost", 1234);
		
		OutputStream output = socket.getOutputStream();//byte로만 받아올 수 있음. 무얼하든 이건 꼭 생성해야함
		DataOutputStream dataOutput = new DataOutputStream(output);
		System.out.println("전송 데이터 입력: ");
		String data = new Scanner(System.in).next();
		
		dataOutput.writeUTF(data);
		System.out.println("전송 완료");
		
		dataOutput.close(); output.close(); socket.close();
	}
}
