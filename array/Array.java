package array;

public class Array<E> {

    private Integer size;
    private E[] data;

    //有参构造函数
    @SuppressWarnings("unchecked")
	public Array(Integer capacity){
        data= (E[]) new Object[capacity];
        size=0;
    }

    //无参构造函数，设置默认容量为10
    public Array(){
        this(10);
    }

    //获取数组中的元素个数
    public Integer getSize(){
        return size;
    }
 
    //获取数组的容量
    public Integer getCapacity(){
        return data.length;
    }

    //判断数组是否为空
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
     * 在索引为index的位置，插入param
     * 1.假如在索引为2的位置插入元素
     * 2.需要将原来索引为2及其以后的位置向后移动一整位
     * 3.移动完成之后，在索引为2的位置插入指定的值
     * 4.因为数组中多了一个值，所以size需要+1
     *
     * @param index 元素的索引
     * @param param 值
     */
    public void add(int index, E param) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("添加失败，索引的值不能小于0，并且索引的值不能大于数组的大小");
        }
        if (size == data.length) {
            throw new IllegalArgumentException("添加失败，数组的大小已经等于了数组容量的大小");
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = param;
        size++;
    }

    //在所有元素之前添加值
    public void addFirst(E param) {
        add(0, param);
    }

    //在所有元素之后添加值
    public void addLast(E param) {
        add(size, param);
    }
    
    
    /**
     * 从数组中删除index位置的元素，并且返回对应的值
     * 1.假如删除索引为3的元素
     * 2.需要将索引大于3的元素向前移动一位
     * 3.因为数组中少了一个值，所以元素-1
     * 4.用临时变量来存储删除的值，用来返回
     * @param index
     * @return
     */
    public E remove(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("删除失败，索引的值不能小于0，并且索引的值不能大于等于数组的大小");
        }
        E temp=data[index];
        for(int i = index+1 ; i < size ; i++){
            data[i-1]=data[i];
        }
        size--;
        return temp;
    }

    //删除第一位元素
    public E removeFirst(){
        return remove(0);
    }

    //删除最后一位元素
    public E removeLast(){
        return remove(size-1);
    }

    //查找数组中是否包含param，如果包含返回索引值，不包含返回-1
    public Integer find(E param){
        for(int i = 0 ; i < size ; i++){
            if(data[i] == param){
                return i;
            }
        }
        return -1;
    }

    //查看某个值是否在数组中存在，如果存在,删除并返回true，如果不存在 返回false
    public boolean removeElement(E param){
        Integer index = find(param);
        if(index != -1){
            remove(index);
            return true;
        }
        return false;
    }
}