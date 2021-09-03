package day18_fileIO;

import java.io.File;
import java.io.FileInputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception{
		File filePath = new File("D:/2Gwork/test/aaa.txt");
		FileInputStream fis = new FileInputStream(filePath);
		//파일 내용 읽어오기
		while(true) {
			int res = fis.read();//int형태로 가져옴
			if(res < 0) {
				//read로 읽어올 때 마지막임을 알려주는 eof라는 값이 자동으로 들어가는데, 
				//-1가 있다면 데이터 2개로 보기때문에 음수가 존재할 수 없다.
				//eof = -1이므로 음수를 만나면 반복문이 끝나게 해준다.
				break;
			}
			System.out.println((char)res);
		}
	}
}
