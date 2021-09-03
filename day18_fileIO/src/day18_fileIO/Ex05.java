package day18_fileIO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("D:/2Gwork/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = scanner.next();
		
		Test05 test05 = new Test05();
		test05.setName(name);
		oos.writeObject(test05);
		oos.close();
	}
}
