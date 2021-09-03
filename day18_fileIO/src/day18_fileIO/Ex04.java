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
		//확장팩 같이 더 다양한 기능이 있는 stream
		
		dos.writeUTF("문자열");
		dos.writeInt(123); 
		//문자열, 숫자, 불린 등 다양한 형태 존재
		dos.close();
		
		String str = "test";
		StringBuffer sb = new StringBuffer();//String보다 처리속도가 더 빠름
		sb.append("문자열"); //추가하는 것
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
