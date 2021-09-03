package day18_fileIO;

import java.io.File;
import java.io.FileInputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception{
		File filePath = new File("D:/2Gwork/test/aaa.txt");
		FileInputStream fis = new FileInputStream(filePath);
		//���� ���� �о����
		while(true) {
			int res = fis.read();//int���·� ������
			if(res < 0) {
				//read�� �о�� �� ���������� �˷��ִ� eof��� ���� �ڵ����� ���µ�, 
				//-1�� �ִٸ� ������ 2���� ���⶧���� ������ ������ �� ����.
				//eof = -1�̹Ƿ� ������ ������ �ݺ����� ������ ���ش�.
				break;
			}
			System.out.println((char)res);
		}
	}
}
