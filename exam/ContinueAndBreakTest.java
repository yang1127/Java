package exam;

public class ContinueAndBreakTest {
	public static void main(String args[])
	{
		int sum= 0;
		for (int i = 1; i < 1000; i++)
		{
			if (sum > 5000)
				break;
			
			if (i % 3 != 0)
				continue;
			
			sum += i; 
		}
		System.out.println(sum);
	}
}
