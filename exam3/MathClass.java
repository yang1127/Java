package exam3;

public class MathClass {
	public static void main(String args[]){
		double a = 12.86;
		int b = (int) a;
		System.out.println("ǿ��ת����" + b);
		long c = Math.round(a);
		System.out.println("�������룺" + c);
		double d = Math.floor(a);
		System.out.println("����a�����������" + d);
		double e = Math.ceil(a);
		System.out.println("����e����С������" + e);
		double x = Math.random();
		System.out.println("Ĭ���������" + x);
		int y = (int) (Math.random()*99);
		System.out.println("0~99֮��������(������99)��" + y);	
	}
}
