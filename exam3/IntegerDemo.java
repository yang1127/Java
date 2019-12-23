package exam3;

public class IntegerDemo {
	public static void main(String args[]){
		//int--string
		int number = 100;
		String s1 = "" + number;
		System.out.println("s1：" + s1);
		
		String s2 = Integer.toString(number);
		System.out.println("s4：" + s2);
		
		//string--int
		String s = "100";
		Integer ii = new Integer(s);
		int x = ii.intValue();
		System.out.println("x：" + x);
		
		int y = Integer.parseInt(s);
		System.out.println("y：" + y);	
		
		//十进制到二、八、十六进制
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));
		
		//十进制到其它进制
		System.out.println(Integer.toString(100, 2));
		System.out.println(Integer.toString(100, 8));
		System.out.println(Integer.toString(100, 10));
		System.out.println(Integer.toString(100, 16));
		System.out.println(Integer.toString(100, 32));
		
		//其它进制到十进制
		System.out.println(Integer.parseInt("100", 2));
		System.out.println(Integer.parseInt("100", 8));
		System.out.println(Integer.parseInt("100", 10));
		System.out.println(Integer.parseInt("100", 16));
		System.out.println(Integer.parseInt("100", 32));
		
	}
}
