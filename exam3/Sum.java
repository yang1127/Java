package exam3;

public class Sum {
	public static void main(String args[]){
		String s1 = "12345";
		String s2 = "56789";
		int i1 = 0, i2 = 0, sum = 0;
		i1 = Integer.parseInt(s1);
		i2 = new Integer(s2).intValue();
		sum = i1 + i2;
		System.out.println("�ͣ�" + sum);
		System.out.println("�����ƣ�" + Integer.toBinaryString(sum));
		System.out.println("ʮ�����ƣ�" + Integer.toHexString(sum));
	}
}
