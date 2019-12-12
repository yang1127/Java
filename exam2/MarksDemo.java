package exam2;

import java.io.*;
class Marks
{
	int engMarks;
	int mathMarks;
	int phyMarks;
}

public class MarksDemo {
	public static void main(String args[])
	{
		Marks obj1 = new Marks();
		obj1.engMarks = 50;
		obj1.mathMarks = 80;
		obj1.phyMarks = 90;
		
		System.out.println(obj1.engMarks);
		System.out.println(obj1.mathMarks);
		System.out.println(obj1.phyMarks);
	}
}
