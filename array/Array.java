package array;

public class Array<E> {

    private Integer size;
    private E[] data;

    //�вι��캯��
    @SuppressWarnings("unchecked")
	public Array(Integer capacity){
        data= (E[]) new Object[capacity];
        size=0;
    }

    //�޲ι��캯��������Ĭ������Ϊ10
    public Array(){
        this(10);
    }

    //��ȡ�����е�Ԫ�ظ���
    public Integer getSize(){
        return size;
    }
 
    //��ȡ���������
    public Integer getCapacity(){
        return data.length;
    }

    //�ж������Ƿ�Ϊ��
    public boolean isEmpty(){
        return size==0;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("Array: size = %d , capacity = %d\n",size,data.length));
        sb.append("[");
        for(int i =0;i<size;i++){
            sb.append(data[i]);
            if(i !=size-1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    /**
     * ������Ϊindex��λ�ã�����param
     * 1.����������Ϊ2��λ�ò���Ԫ��
     * 2.��Ҫ��ԭ������Ϊ2�����Ժ��λ������ƶ�һ��λ
     * 3.�ƶ����֮��������Ϊ2��λ�ò���ָ����ֵ
     * 4.��Ϊ�����ж���һ��ֵ������size��Ҫ+1
     *
     * @param index Ԫ�ص�����
     * @param param ֵ
     */
    public void add(int index, E param) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("���ʧ�ܣ�������ֵ����С��0������������ֵ���ܴ�������Ĵ�С");
        }
        if (size == data.length) {
            throw new IllegalArgumentException("���ʧ�ܣ�����Ĵ�С�Ѿ����������������Ĵ�С");
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = param;
        size++;
    }

    //������Ԫ��֮ǰ���ֵ
    public void addFirst(E param) {
        add(0, param);
    }

    //������Ԫ��֮�����ֵ
    public void addLast(E param) {
        add(size, param);
    }
    
    
    /**
     * ��������ɾ��indexλ�õ�Ԫ�أ����ҷ��ض�Ӧ��ֵ
     * 1.����ɾ������Ϊ3��Ԫ��
     * 2.��Ҫ����������3��Ԫ����ǰ�ƶ�һλ
     * 3.��Ϊ����������һ��ֵ������Ԫ��-1
     * 4.����ʱ�������洢ɾ����ֵ����������
     * @param index
     * @return
     */
    public E remove(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("ɾ��ʧ�ܣ�������ֵ����С��0������������ֵ���ܴ��ڵ�������Ĵ�С");
        }
        E temp=data[index];
        for(int i = index+1 ; i < size ; i++){
            data[i-1]=data[i];
        }
        size--;
        return temp;
    }

    //ɾ����һλԪ��
    public E removeFirst(){
        return remove(0);
    }

    //ɾ�����һλԪ��
    public E removeLast(){
        return remove(size-1);
    }

    //�����������Ƿ����param�����������������ֵ������������-1
    public Integer find(E param){
        for(int i = 0 ; i < size ; i++){
            if(data[i] == param){
                return i;
            }
        }
        return -1;
    }

    //�鿴ĳ��ֵ�Ƿ��������д��ڣ��������,ɾ��������true����������� ����false
    public boolean removeElement(E param){
        Integer index = find(param);
        if(index != -1){
            remove(index);
            return true;
        }
        return false;
    }
}