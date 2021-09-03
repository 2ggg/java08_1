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
		//buffer��� �ٸ� ��������� ����� buffer������ ������ ��
		
		for(char i = '1'; i<'9'; i++) {
			Thread.sleep(1000);
			//fos.write(i);//�̶� �����͵��� ���������� ���Ͽ� �����ϱ⶧���� �����ɸ�������
			bos.write(i);//buffer�� ��� ������ �ױ�
			
		}
		bos.flush(); //���Ͽ� �����ϰ� buffer�� �ִ� �����͸� ������ 
		bos.close(); //���Ͽ� �����ϰ� buffer�� ������ ���������
		//������ ����� �Ʒ� �ڵ忡���� bos��� �Ұ�
		
		
	}
}
