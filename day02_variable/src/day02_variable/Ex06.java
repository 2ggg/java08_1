package day02_variable;

import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		int val;
		System.out.print("�Է�:");
		val = System.in.read();
		System.out.println("�Է� data: "+val);
		System.out.println("�Է� data: "+(char)val);
		
		System.in.read();
		System.in.read();
		
		System.out.print("2��° �Է�:");
		char ch = (char) System.in.read();
		System.out.println("�Է� ������: "+ch);
	}
	
	
}