package exam3;

abstract class animal{
	String name;
	int leg;
	public animal(String name, int leg)
	{
		this.name = name;
		this.leg = leg;
	}
}
class lion extends animal
{
	public lion(String name, int leg)
	{
		super(name, leg);
	}
	public void eat()
	{
		System.out.println("≥‘»‚");
	}
}
public class d {
	public static void main(String args[]){
		lion li = new lion("∑«÷ﬁ ®", 4);
		li.eat();
	}
}
