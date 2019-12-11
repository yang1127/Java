package exam;

import java.util.Scanner;
public class NumberMuliply {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);   
		System.out.print("请输入被乘数："); 
		double num1  = sc.nextDouble();   
		System.out.print("请输入乘数："); 
		double num2  = sc.nextDouble(); 	
		System.out.println(num1 + "x" + num2 + "=" + num1 * num2);		
	}

}
