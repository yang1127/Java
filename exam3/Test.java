package exam3;

class Animal{
	void eat(){
		System.out.println("animal: eat");
	}
}

class Dog extends Animal{
	void eat(){
		System.out.println("dog: eat");
	}
	
	void eatTest(){
		this.eat(); //this调用自己的方法
		super.eat(); //super调用父类方法
	}
}

public class Test {
	public static void main(String args[]){
		Animal a = new Animal();
		a.eat();
		Dog d = new Dog();
		d.eatTest();
	}
}
