package exam3;
/*�β�����:
 *  �������ͣ��βεĸı䲻��Ӱ��ʵ�ʲ���
 *  �������ͣ��βεĸı�ֱ��Ӱ��ʵ�ʲ���
 */

//��������
class Demo{ 
	public int sum(int a, int b) {
		return a + b;
	}
}

//����
class Std{
	int a;
	public void show() {
		System.out.println("�Ұ�ѧϰ");
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
		//�������͵���
		Demo d = new Demo();
		int result = d.sum(10, 20);
		System.out.println("result:" + result);
		System.out.println("----------------");
		
		//���õ���
		StudentDemo sd = new StudentDemo();
		Std s = new Std();
		System.out.println(s.a);
		sd.method(s);
		System.out.println(s.a);
	}
}