package tcp;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) throws Exception{
		
		ServerSocket server = new ServerSocket(12345);
		//자기 자신의 아이피와 port(12345)로 서버 구동
		//port번호란 2byte 크기를 갖고 특정 프로그램(어플)을 구분 지어줌
		//8bit > 1024byte >  1024kbyte > 1024mbyte > GB > TB
		//2byte이므로 0~65535까지 지정 가능
		//서버 : 서비스를 제공하는 컴퓨터
		//클라이언트 : 서비스 제공받는 컴퓨터
		System.out.println("접속 대기합니다.");
		Socket socket = server.accept();//외부통신과 연결시켜줌. 소켓 하나에 접속 한명만 가능
		System.out.println("접속 되었습니다.");
		//접속하는 사람이 없기때문에 접속되었다는 문구는 출력되지 않음
		//서버를 먼저 열어놓지 않으면 클라이언트는 접속 불가
		System.out.println(socket.getInetAddress());//접속한 사용자 주소 출력
		//127.0.0.1는 자기자신
		InputStream input = socket.getInputStream();
		int readData = input.read();//데이터 읽어오기
		System.out.println("수신 데이터 : "+readData);
		input.close(); socket.close();
		System.out.println("서버가 닫혔습니다.");
	}
}
