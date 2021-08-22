package day14_Exception;

public class Ex03 {
	public static void main(String[] args) {
		try {
			int age = -1;
			if(age<0) {
				throw new Exception("잘못 입력됐습니다.");
				//Exception을 새로 만드는 것
			}
		} catch (Exception e) {//위에서 만든 Exception이 들어감
			System.out.println(e.getMessage());
		}
	}
}
