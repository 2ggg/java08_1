package day09_method;

import java.util.Scanner;

public class Ex01 {
/*
class
- ����� ���� �ڷ���(����ڰ� ����� ������� ����� ���)
- ���� ����

��ü
- ���� = ��ü
- class �ڷ������� ���� ����

�޼ҵ�
- () �ִ� ���
- ���
- �޼ҵ� �Ǵ� �Լ��� �θ�
- Ŭ���� ���ο��� ����
- Ŭ���� ���� ���������� ��� ����

���� ������
- public : �ܺ�, ���� ���� ��� ���
- private : �ܺ� ���� ����. ���ο����� ��� ����
- protected : ��ӹ��� �ڽ�
- default(���������� X) : ������ ��Ű�������� ���� ����
 */

public String name, addr, phNum, birthString;
public int age, stNum;

	public static void main(String[] args) {
		
		Ex01 ex01 = new Ex01(); //��ü
		ex01.age = 12345;
		ex01.name = "�ȳ��ϼ���";
		System.out.println(ex01.name);
		System.out.println(ex01.age);
	}
}
