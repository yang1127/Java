package exam4;

import java.util.ArrayList;
class MyQueue<T>
{
	private LinkedList<T> l1 = new LinkedList<T>();
	
	public boolean add(T e)
	{
		return l1.add(e);
	}
	
	public T remove()
	{
		if(l1.size() > 0)
			return l1.remove();
		else
			return null;
	}
}

public class main {
	public static void main(String args[]){
		MyQueue<String> mq = new MyQueue<String>();
		mq.add("Tom");
		mq.add("Marry");
		mq.add("Jack");
		
		String element;
		while((element = mq.remove()) != null)
		{
			System.out.println(element);
		}
	}
}
