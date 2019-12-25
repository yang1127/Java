package exam3;

interface Pet {
	public void play();
	public void eat();
}

class Dog implements Pet
{
	public void play()
	{
		System.out.println("Dog play");
	}
	
	public void eat()
	{
		System.out.println("Dog eat");
	}
}

public class ce
{
	public static void main(String args[]){
		Dog dog = new Dog();
		dog.eat();
		dog.play();
	}
}

