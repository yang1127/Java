
public class Student {
	String school; //У��
	int stuNumber; //ѧ��
	String gender; //�Ա�
	String birthdate; //����
	String name; //����
	int score;   //�ɼ�
	
	void setName(){
		System.out.println("������"+name);
	}
	
	void setScore(){
		System.out.println("�ɼ���"+score);
	}
	
	public  static void main (String[] args){
		Undergraduate stu1 = new Undergraduate();
		
		stu1.school="�����ƾ���ѧ";
		stu1.stuNumber=1705990517;
		stu1.gender="17��";
		stu1.birthdate= "1998.09.21";
		stu1.name="��֥��";
		stu1.score=80;
		stu1.department="��ϢѧԺ";
		stu1.major="�������";
		
		System.out.println("���գ�"+stu1.birthdate);
		System.out.println("�꼶��"+stu1.gender);
		System.out.println("ѧУ��"+stu1.school);
		System.out.println("ѧ�ţ�"+stu1.stuNumber);
		
		stu1.setName();
		stu1.setScore();
		stu1.setDepartment();
		stu1.setMajor();			
	}

}

class Undergraduate extends Student {
		String department;
		String major;
		
		void setDepartment(){
			System.out.println("ϵ��"+department);	
		}
		
		void setMajor(){
			System.out.println("רҵ��"+major);
		}	
}
 
