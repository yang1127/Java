package exam2;

public class RomanToInt {
	public static int romanToInt(String s)
	{
		char[] ch = s.toCharArray();
		int result = 0;
		for(int i = 0; i < ch.length; i++)
		{
			switch(ch[i]) {
			case 'M':result += 1000; break;
			case 'D':result += 500; break;
			case 'L':result += 50; break;
			case 'V':result += 5; break;
			case 'I':
				if(i + 1 < ch.length && (ch[i + 1] == 'V' || ch[i + 1] == 'X' )) {
					result -= 1;
				}else {
					result += 1;
				}
			
			case 'X':
				if(i + 1 < ch.length && (ch[i + 1] == 'L' || ch[i + 1] == 'C' )) {
					result -= 10;
				}else {
					result += 10;
				}
			
			case 'C':
				if(i + 1 < ch.length && (ch[i + 1] == 'D' || ch[i + 1] == 'M' )) {
					result -= 100;
				}else {
					result += 100;
				}
				break;
			default:
				break;		
			}
		}
		return result;
	}
}
