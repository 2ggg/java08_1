package day18_fileIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("D:/2Gwork/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath,true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		//Ȯ���� ���� �� �پ��� ����� �ִ� stream
		
		dos.writeUTF("���ڿ�");
		dos.writeInt(123); 
		//���ڿ�, ����, �Ҹ� �� �پ��� ���� ����
		dos.close();
		
		String str = "test";
		StringBuffer sb = new StringBuffer();//String���� ó���ӵ��� �� ����
		sb.append("���ڿ�"); //�߰��ϴ� ��
		sb.append("111"); 
		str+="aaa";
		
		FileInputStream fis = new FileInputStream(filePath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		String name=dis.readUTF();
		int num = dis.readInt();
		System.out.println("name: "+name);
		System.out.println("num: "+num);
		
	}
}
