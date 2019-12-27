package exam4;

import java.util.*;
class MyStack<T>
{
	private ArrayList<T> a1 = new ArrayList<T>();
	public boolean push(T e)
	{
		return a1.add(e);
	}
	public T pop()
	{
		if(a1.size() > 0)
			return a1.remove(a1.size() - 1);
		else
			return null;
	}
	public int size()
	{
		return a1.size();
	}
}
public class MainClass {
	public static void main(String args[]){
		MyStack<String> ms = new MyStack<Sting>();
		ms.push("Tom");
		ms.push("Marry");
		ms.push("Jack");
		
		String element;
		while((element = ms.pop()) != null)
		{
			System.out.println(element);
		}
	}
}
