package day18_fileIO;

import java.io.File;
import java.io.FileOutputStream;


public class Ex01 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("D:/2Gwork/test/aaa.txt");
		//��� ����
		//FileOutputStream fos = new FileOutputStream(filePath);
		//��ο� ���� ��������. ���� ������ �ֵ���� �������� ���ְ� ���������
		FileOutputStream fos = new FileOutputStream(filePath, true);
		//���� ������ ������ �ȿ� �ִ� ������ �ڸ� �̾� �ۼ�
		
		fos.write(97); //=a
		fos.write('A');
		fos.write(100); //=d
		//int�� �ƴ϶� byte�� ���� ������ ���ĺ��� ��µ�
		fos.write(0);
		
		String name="�ȳ��ϼ���";
		fos.write(name.getBytes());
		
		
	}
}
