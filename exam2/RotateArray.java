package exam2;

public class RotateArray {
	void leftRotate(int arr[], int d, int n) //Ҫ��ת�ĸ���
	{
		for (int i = 0; i < d; i++)
			leftRotatebyOne(arr, n);
	}
	
	void leftRotatebyOne(int arr[], int n) //�����������ǰ���ƶ�
	{
		int i, tmp;
		tmp = arr[0];
		for (i = 0; i < n-1; i++)
			arr[i] = arr[i + 1];
		arr[i] = tmp;
	}
	
	void ptintArray(int arr[], int n) //��ӡ
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void main(String args[])
	{
		RotateArray rotate = new RotateArray();
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		rotate.leftRotate(arr, 2, 7); //��ת2����
		rotate.ptintArray(arr, 7);
	}
}
