package exam3;

import java.util.Arrays;
public class Random {
	public static void main(String args[]){
		char[] c = new char[20];
		Random r = new Random();
		for(int i = 0; i < c.length; i++){
			c[i] = (char)('A' + r.nextInt(26));
		}
		//ÅÅÐòÇ°
		System.out.println(new String(c));
		//ÅÅÐò
		Arrays.sort(c);
		System.out.println(new String(c));
	}
}
