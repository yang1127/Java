package exam3;
/*形参问题:
 *  基本类型：形参的改变不会影响实际参数
 *  引用类型：形参的改变直接影响实际参数
 */

//基本类型
class Demo{ 
	public int sum(int a, int b) {
		return a + b;
	}
}

//引用
class Std{
	int a;
	public void show() {
		System.out.println("我爱学习");
	}
}
class StudentDemo{
	public void method(Std s) {
		s.a = 100;
		s.show();
	}
}

public class ArgsTest {
	public static void main(String args[])
	{
		//基本类型调用
		Demo d = new Demo();
		int result = d.sum(10, 20);
		System.out.println("result:" + result);
		System.out.println("----------------");
		
		//引用调用
		StudentDemo sd = new StudentDemo();
		Std s = new Std();
		System.out.println(s.a);
		sd.method(s);
		System.out.println(s.a);
	}
}