package togglecase;

import java.util.Scanner;

public class togglecase {
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("«Î ‰»Î“ª∂Œ◊÷∑˚¥Æ");
		String s=sc.next();
		int a=s.length();String b[]=new String[a];String c[]=new String[a];
		char d[]=new char[a];
		for (int i=0;i<=a;i++){
			d[i]=s.charAt(i);
			
			if(d[i]>='a'){
				b[i]=String.valueOf(d[i] );
				c[i]=b[i].toUpperCase();
				}
			
		    else{	
			    b[i]=String.valueOf(d[i] );
			    c[i]=b[i].toLowerCase();
			}
		System.out.print(c[i]);
		}
	}
}
