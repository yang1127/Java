package exam3;

class Experience{
	private String educationBackground;
	private String skills;
	
	public void setExperience(String educationBackground, String skills){
		this.educationBackground = educationBackground;
		this.skills = skills;
	}
	
	public String toString(){
		return educationBackground + skills;
	}
}

class Resume implements Cloneable{
	private String name;
	private String sex;
	private int age;
	private Experience experience;
	public Resume(String name, String sex, int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.experience = new Experience();
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(int age){
		return age;
	}
	public void setExperience(String educationBackground, String skills){
		experience = new Experience();
		experience.setExperience(educationBackground, skills);
	}
	public Experience getExperience(){
		return experience;
	}
	
	public void displayResume(){
		System.out.println("姓名：" + name + "性别：" + sex + "年龄：" + age);
		System.out.println("工作经历：" + experience.toString());
	}
	
	public Object clone(){
		try{
			return (Resume)super.clone();
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
}

public class MainClass {
	public static void main(String args[]){
		Resume zhangsan = new Resume("张三", "男", 24);
		zhangsan.setExperience("2009-2013就读于家里蹲大学，精通JAVA，C，C++，C#等代码复制");
	    zhangsan.displayResume();
	    
	    Resume zhangsan2 =(Resume) zhangsan.clone();
	    zhangsan2.setExperience("2009-2013就读于家里蹲大学，精通JAVA，C，C++，C#等代码复制");
	    zhangsan2.displayResume();
	    zhangsan.displayResume();
	}
}
