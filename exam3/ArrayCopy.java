package exam3;

public class ArrayCopy {
	public static void main(String args[]){
		byte a[] = {65, 66, 67, 68, 69, 70, 71};
		byte b[] = {88, 88, 88, 88, 88, 88, 88, 88};
		System.out.println("a=" + new String(a));
		System.out.println("b=" + new String(b));
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println("b=" + new String(b));
		System.arraycopy(b, 5, a, 0, 4);
		System.out.println("a=" + new String(a));
	}
}
