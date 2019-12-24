package exam3;

public class MathClass {
	public static void main(String args[]){
		double a = 12.86;
		int b = (int) a;
		System.out.println("强制转换：" + b);
		long c = Math.round(a);
		System.out.println("四舍五入：" + c);
		double d = Math.floor(a);
		System.out.println("返回a的最大整数：" + d);
		double e = Math.ceil(a);
		System.out.println("返回e的最小整数：" + e);
		double x = Math.random();
		System.out.println("默认随机数：" + x);
		int y = (int) (Math.random()*99);
		System.out.println("0~99之间的随机数(不包括99)：" + y);	
	}
}
