package exam;

import java.util.Scanner;

public class Count {
	public static void main(String args[])
	{
		int countPositive = 0, countNegative = 0;
		int num;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do
		{
			num = sc.nextInt();
			if(num > 0)
				countPositive++;
			
			else if(num < 0)
				countNegative++;		
		}while(num != 0);
			
		System.out.println("the number of postives is" + countPositive);
		System.out.println("the number of negatives is" + countNegative);	
	}
}
