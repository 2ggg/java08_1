package day01;

public class Q01 {
private void forr(String mun) {
	for(int i=0; i<=45; i++) {
		System.out.print(mun);
	}
	System.out.println();
}
	public static void main(String[] args) {
		Q01 q01 = new Q01();
		q01.forr("=");
		System.out.println("�̸�\t����\t��ȭ��ȣ\t\tȸ��");
		q01.forr("=");
		int n=20000;
		int m=30000;
		int l=50000;
		String nn = "%s\t\"15\"\t%s\t\\%d%n";
		System.out.printf(nn,"ȫ�浿","3672-1234",n);
		System.out.printf(nn,"��浿","2238-1234",m);
		System.out.printf(nn,"�踻��","1234-1234",l);
		q01.forr("-");
		System.out.println("�� �հ�\t\t\t\t\\"+(n+m+l));
		q01.forr("-");

	}

}
