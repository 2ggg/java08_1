package day18_fileIO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception{
		File filePath = new File("D:/2Gwork/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath,true);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//buffer라는 다른 저장공간을 만들어 buffer에서만 저장을 함
		
		for(char i = '1'; i<'9'; i++) {
			Thread.sleep(1000);
			//fos.write(i);//이때 데이터들이 지속적으로 파일에 접근하기때문에 오래걸릴수있음
			bos.write(i);//buffer에 계속 데이터 쌓기
			
		}
		bos.flush(); //파일에 접속하고 buffer에 있는 데이터를 비워줘라 
		bos.close(); //파일에 접속하고 buffer와 연결을 끊어버려라
		//연결이 끊기면 아래 코드에서는 bos사용 불가
		
		
	}
}
