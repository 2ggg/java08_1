package day03_operator;

public class Ex04_op {

	public static void main(String[] args) {
		/*
		 논리 연산자
		 - 참/거짓
		 
		 ||(or) : 하나라도 true면 true
		 	true||true : true
		 	false||false : false
		 	
		 &&(and) : 모두가 참이여야 참
		 	true&&true : true
		 	true&&false : false
		 
		 !(not) : 결과 반전 true>false / false>true
		 	!false : true
		 	!true : false
		 */
		System.out.println((10>3)||(10==10));
		System.out.println((10<3)||(10==10));
		System.out.println((10<3)||(10!=10));
		System.out.println((10>3)&&(10==10));
		System.out.println((10<3)||(10==10));
		System.out.println((10<3)&&(10!=10));
		
	}

}
