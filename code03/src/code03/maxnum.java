package code03;

//��һά��������ֵ��������λ�ã�����Math.random()���������
public class maxnum {
	public static void main(String[] args){
		final int array_size = 10;
		int a[] = new int [array_size];
		int max = 0;
		int index = 0; //�洢���Ԫ�ص�λ��
		for (int i = 0; i < a.length; i++){
			a[i] = (int) (Math.random() * 10); //��������������������Ա��ֵ
			System.out.print(" " + a[i]);
		}
		
		System.out.println();
		max = a[0];
		for (int j = 1; j < array_size; j++){
			if(a[j] > max)  //�жϵ�ǰλ�õ����Ƿ�������ֵmax
			{
				max = a[j];
				index = j; //�滻��ǰ�����ֵ����ס��Ӧ��λ��
			}
		}
		System.out.println("a[" + index + "] has maximum value��" + a[index]);
	}

}
