package day10_classVariable;

import java.util.Scanner;

public class Ex06_final {
	public final String korea = "���ѹα�"; //���� �Ұ�
	public static final String koreaa = "����"; //
	public void func() {
		System.out.println("������ korea:"+korea);
		Scanner scanner= new Scanner(System.in);
		System.out.println("�Է�");
		//korea = scanner.next(); //������
		//korea = "����"; //������
		System.out.println("������:"+korea);
	}
}
