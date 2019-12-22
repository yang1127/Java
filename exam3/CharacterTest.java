package exam3;

import java.util.Scanner;
public class CharacterTest {
	public static void main(String args[]){
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
		String line = sc.nextLine();
		char[] chs = line.toCharArray();
		for(int x = 0; x < chs.length; x++){
			char ch = chs[x];
			if(Character.isUpperCase(ch)){
				bigCount++;
			}else if(Character.isLowerCase(ch)){
				smallCount++;
			}else if(Character.isDigit(ch)){
				numberCount++;
			}
		}
		System.out.println("´óĞ´×ÖÄ¸£º" + bigCount++);
		System.out.println("Ğ¡Ğ´×ÖÄ¸£º" + smallCount++);
		System.out.println("Êı×Ö×Ö·û£º" + numberCount++);
	}
}
