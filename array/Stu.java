package array;

public class Stu{
	private String name;
	private int score;
	
	public Stu(String stuName, int stuScore) {
		name = stuName;
		score = stuScore;
	}

	public String toString() {
		return String.format("Stu(name: %s, score: %d)", name, score);
	}
	
	public static void main(String args[])
	{
		Array<Stu> arr = new Array<>();
		arr.addLast(new Stu("Alice", 100));
		arr.addLast(new Stu("Bob", 66));
		arr.addLast(new Stu("Xiaoyang", 88));
		System.out.println(arr);		
	}
}