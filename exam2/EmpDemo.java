package exam2;

import java.io.*;
class Emp{
	public static double salary;
	public static String name = "Harsh";
}

public class EmpDemo {
	public static void main(String args[])
	{
		Emp.salary = 1000;
		System.out.println(Emp.name + "'s average salary£º" + Emp.salary);
	}
}
