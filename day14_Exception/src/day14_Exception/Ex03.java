package day14_Exception;

public class Ex03 {
	public static void main(String[] args) {
		try {
			int age = -1;
			if(age<0) {
				throw new Exception("�߸� �Էµƽ��ϴ�.");
				//Exception�� ���� ����� ��
			}
		} catch (Exception e) {//������ ���� Exception�� ��
			System.out.println(e.getMessage());
		}
	}
}
