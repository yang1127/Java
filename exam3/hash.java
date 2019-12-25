package exam3;

public class hash {
	public static void main(String args[]){
		Student s1 = new Student();
		System.out.println(s1.hasCode());
		Student s2 = new Student();
		System.out.println(s2.hasCode());
		Student s3 = s1;
		System.out.println(s3.hasCode());
		System.out.println("-----------");
		
		student s = new Student();
		Class c = s.getClass();
		String str = c.getName();
		System.out.println(Str);
		
		String str2 = s.getClass().getName();
		System.out.println(Str2);
	}
}
