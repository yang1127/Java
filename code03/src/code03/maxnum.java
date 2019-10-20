package code03;

//求一维数组的最大值及其所在位置，采用Math.random()产生随机数
public class maxnum {
	public static void main(String[] args){
		final int array_size = 10;
		int a[] = new int [array_size];
		int max = 0;
		int index = 0; //存储最大元素的位置
		for (int i = 0; i < a.length; i++){
			a[i] = (int) (Math.random() * 10); //产生随机数，并对数组成员赋值
			System.out.print(" " + a[i]);
		}
		
		System.out.println();
		max = a[0];
		for (int j = 1; j < array_size; j++){
			if(a[j] > max)  //判断当前位置的数是否大于最大值max
			{
				max = a[j];
				index = j; //替换当前的最大值，记住对应的位置
			}
		}
		System.out.println("a[" + index + "] has maximum value：" + a[index]);
	}

}
