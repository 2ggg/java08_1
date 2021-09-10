package tcp;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 12345);
		//"접속할 ip"(여기선 내pc), 접근할 포트번호 12345
		OutputStream out = socket.getOutputStream();
		//OutputStream 서버와 연결된, 데이터를 내보내는 길을 터줌
		//out.write(10); //10이란 데이터를 써서 내보냄
		System.out.println("서버에 내보낼 데이터, 수 입력: ");
		int num = new Scanner(System.in).nextInt();
		out.write(num);
	}
}
