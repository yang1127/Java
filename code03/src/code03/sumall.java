package code03;

//求二维数组中个元素的和
public class sumall {
	public static void main(String[] args){
		int total = 0;
		int arr[][] = new int[3][4];
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				arr[i][j] = i + j;
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				total = total + arr[i][j];
			}
		}
		System.out.println("This sum is:" + total);
	}

}
