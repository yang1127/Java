package exam3;

class GrandFather{
	public void show(){
		System.out.println("����үү");
	}
}

class Father extends GrandFather{
	public void method(){
		System.out.println("���ǰְ�");
	}
}

class Son extends Father {}

public class GFS {
	public static void main(String args[]){
		Son s = new Son();
		s.method(); //ʹ�ðְ�
		s.show(); //ʹ��үү
	}
}
