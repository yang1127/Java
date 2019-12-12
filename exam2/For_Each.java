package exam2;

public class For_Each {
	public static void main(String args[])
	{
		int[] marks = {125, 132, 95, 116, 110};
		int highest_marks = maxnum(marks);
		System.out.println("The highest score is " + highest_marks);
	}
	
	public static int maxnum(int[] numbers){
		int maxSoFar = numbers[0];
		for(int num : numbers)
		{
			if(num > maxSoFar)
				maxSoFar = num;
		}
		return maxSoFar;
	}
}
