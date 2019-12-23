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
		System.out.println("������" + name + "�Ա�" + sex + "���䣺" + age);
		System.out.println("����������" + experience.toString());
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
		Resume zhangsan = new Resume("����", "��", 24);
		zhangsan.setExperience("2009-2013�Ͷ��ڼ���״�ѧ����ͨJAVA��C��C++��C#�ȴ��븴��");
	    zhangsan.displayResume();
	    
	    Resume zhangsan2 =(Resume) zhangsan.clone();
	    zhangsan2.setExperience("2009-2013�Ͷ��ڼ���״�ѧ����ͨJAVA��C��C++��C#�ȴ��븴��");
	    zhangsan2.displayResume();
	    zhangsan.displayResume();
	}
}
