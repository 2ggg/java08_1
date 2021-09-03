package day18_fileIO;

import java.io.File;
import java.io.FileOutputStream;


public class Ex01 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("D:/2Gwork/test/aaa.txt");
		//경로 저장
		//FileOutputStream fos = new FileOutputStream(filePath);
		//경로에 파일 내보내기. 기존 파일이 있든없든 기존것은 없애고 덮어씌워버림
		FileOutputStream fos = new FileOutputStream(filePath, true);
		//기존 파일이 있으면 안에 있는 내용의 뒤를 이어 작성
		
		fos.write(97); //=a
		fos.write('A');
		fos.write(100); //=d
		//int가 아니라 byte로 들어가기 때문에 알파벳이 출력됨
		fos.write(0);
		
		String name="안녕하세요";
		fos.write(name.getBytes());
		
		
	}
}
