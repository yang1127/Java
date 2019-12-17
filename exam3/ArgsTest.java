package exam3;

class Demo{
	public int sum(int a, int b) {
		return a + b;
	}
}
class Student{
	int a;
	public void show() {
		System.out.println("Œ“∞Æ—ßœ∞");
	}
}
class StudentDemo{
	public void method(Student s) {
		s.a = 100;
		s.show();
	}
}

public class ArgsTest {
	public static void main(String args[])
	{
		Demo d = new Demo();
		int result = d.sum(10, 20);
		System.out.println("result:" + result);
		System.out.println("----------------");
		
		StudentDemo sd = new StudentDemo();
		Student s = new Student();
		System.out.println(s.a);
		
		sd.method(s);
		System.out.println(s.a);
	}
}