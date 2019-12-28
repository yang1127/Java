public class Main {

	/**
	 * @param args
	 */
	public Main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack<Integer> stack= new ArrayStack<Integer>();
		
		for(int i=0;i<5;i++){
			stack.push(i);
			System.out.println(stack);
		}
		stack.pop();
		System.out.println(stack);
	}
}