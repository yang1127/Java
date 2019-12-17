package exam3;

class student{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

public class StudentTest {
	public static void main(String args[])
	{
		student s = new student();
		s.setName("xiaoyang");
		s.setAge(20);
		System.out.println(s.getName()+"----"+s.getAge());
	}
}
