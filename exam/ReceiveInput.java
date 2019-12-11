package exam;

import java.util.Scanner;

public class ReceiveInput {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);   //创建输入
		System.out.println("请输入你的姓名："); 
		String name = sc.nextLine();           //获取一行文本
		
		System.out.println("请输入你的年龄："); 
		int age = sc.nextInt();                //获取整数输入
		
		System.out.println("请输入你的身高："); 
		double stature = sc.nextDouble();      //获取double类型的输入
		
		System.out.println(age + "岁的" + name + "在西安财经大学上学，" + "他的身高有" + stature +"米高");
		
	}
}
