package day03_operator;

public class Ex04_op {

	public static void main(String[] args) {
		/*
		 �� ������
		 - ��/����
		 
		 ||(or) : �ϳ��� true�� true
		 	true||true : true
		 	false||false : false
		 	
		 &&(and) : ��ΰ� ���̿��� ��
		 	true&&true : true
		 	true&&false : false
		 
		 !(not) : ��� ���� true>false / false>true
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
