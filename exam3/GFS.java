package exam3;

class GrandFather{
	public void show(){
		System.out.println("我是爷爷");
	}
}

class Father extends GrandFather{
	public void method(){
		System.out.println("我是爸爸");
	}
}

class Son extends Father {}

public class GFS {
	public static void main(String args[]){
		Son s = new Son();
		s.method(); //使用爸爸
		s.show(); //使用爷爷
	}
}
