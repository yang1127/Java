package exam2;

import java.lang.reflect.Array;

public class test {
	public static void main(String args[])
	{
		System. out. println("String array default values:");
		String str[]  = new String[5];
		for (String s : str)
			System. out.print(s+"");

		System. out. println("nnInteger array default values:");
		int num[]  = new int[5];
		for (int val : num)
			System. out.print(val + " ");

	    System. out. println ("(nnDouble array default values:");
	    double dnum[]  = new double[5];
	    for (double val : dnum)
	    	System. out.print(val + " ");

		System. out. println("nnBoolean array default values:");
		boolean bnum [ ]  = new boolean[5];
		for (boolean val : bnum)
			System. out.print(val + "");

		System. out. println("nnReference Array default values:");
		Array ademo[]  = new Array[5];
		for (Array val :  ademo)
			System. out.print (val + "");
	}
}
