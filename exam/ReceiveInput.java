package exam;

import java.util.Scanner;

public class ReceiveInput {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);   //��������
		System.out.println("���������������"); 
		String name = sc.nextLine();           //��ȡһ���ı�
		
		System.out.println("������������䣺"); 
		int age = sc.nextInt();                //��ȡ��������
		
		System.out.println("�����������ߣ�"); 
		double stature = sc.nextDouble();      //��ȡdouble���͵�����
		
		System.out.println(age + "���" + name + "�������ƾ���ѧ��ѧ��" + "���������" + stature +"�׸�");
		
	}
}
