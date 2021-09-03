package day18_fileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) throws Exception {
		String name, adr, agestr;
		int age;
		File filePath = new File("D:/2Gwork/test/abcd1234.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름>>");
		name = scanner.next();
		System.out.print("나이>>");
		age = scanner.nextInt();
		
		System.out.print("주소>>");
		adr = scanner.next();
		agestr = Integer.toString(age);
		name+="\n";
		agestr+="\n";
		fos.write(name.getBytes());
		fos.write(agestr.getBytes());
		fos.write(adr.getBytes());
		
		
		
	}
}
