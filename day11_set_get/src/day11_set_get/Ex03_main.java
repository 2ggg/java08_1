package day11_set_get;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03_set_get ex03 = new Ex03_set_get();
		//ex03.num = 12345; //private¶ó ¿¡·¯
		ex03.setNum(12345); ex03.print();
		int num = ex03.getNum()-1000;
		System.out.println(num);
		
	}
}
