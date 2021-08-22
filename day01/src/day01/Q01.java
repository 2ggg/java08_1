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
		System.out.println("이름\t나이\t전화번호\t\t회비");
		q01.forr("=");
		int n=20000;
		int m=30000;
		int l=50000;
		String nn = "%s\t\"15\"\t%s\t\\%d%n";
		System.out.printf(nn,"홍길동","3672-1234",n);
		System.out.printf(nn,"고길동","2238-1234",m);
		System.out.printf(nn,"김말이","1234-1234",l);
		q01.forr("-");
		System.out.println("총 합계\t\t\t\t\\"+(n+m+l));
		q01.forr("-");

	}

}
