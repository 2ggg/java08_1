package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
/*
���� ��Ȳ
- ���� �ǵ��� �ٸ��� �����ϴ� �͵�
����
- �������� : throw
- �������� : throws
- ����ó�� : try, catch
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y, result;
		System.out.print("�� �Է�: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		try {
			result = x/y;
			System.out.println("x/y = "+result);
		} catch (ArithmeticException e) {//ó���� ���� �Է�. 
			//ArithmeticException : ���α׷� ���������
			System.out.println("0���� ���� �� �����ϴ�.");
			e.printStackTrace(); //���� �߻� �ٿ��� ã�� �ܰ躰�� ���� ���
			e.getMessage(); //���� �޼��� ���
			e.toString(); //������ ���� �޼��� Ȯ��
			
		} catch (InputMismatchException e) {
			// Ÿ���� �ٸ���
			System.out.println("���ڸ� �Է��� �� �����ϴ�.");
			
		} catch (NullPointerException e) {
			// NullPointerException : null ���۷��� �����Ҷ�
			System.out.println("������ �����ϴ�.");
		
		
		}finally {
			System.out.println("finally�� ������ ����Ǵ� ����");
		}
		System.out.println("���� ����");
	}
}
