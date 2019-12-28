public class Array<E> {
	
  private E[] data;
  private int size;
  
  //���캯�����������������capacity����Array
  @SuppressWarnings("unchecked")
public Array(int capacity){
	  data = (E[])new Object[capacity];
	  size=0;
  }
  
  //�޲ι��죬Ĭ�������������capacity=10
  public Array(){
	  this(10);
  }
  
  //��ȡ���������
  public int getCapacity(){
	  return data.length;
  }
  
  //��ȡ�����е�Ԫ�ظ���
  public  int getSize(){
	  return size;
  }
  
  //�п�
  public boolean is_empty(){
	  return size==0;
  }
  
  //����
  public boolean is_full(){
	  return size>=10;
  }
  
  //����Ԫ��e��index����λ��
  public void arr_push(int index,E e){
	  if(is_empty()||is_full())
		  throw new IllegalArgumentException("push failed!");
	  
	  if(size==data.length)
		  resize(2*data.length);
	  
	  for(int i=size-1;i>=index;i--)
		  data[i+1]=data[i];
	  
	  data[index]=e;
	  size++;
	  
  }
  private void resize(int i) {
	// TODO Auto-generated method stub
	
}
  
 //������Ԫ�غ����һ����Ԫ��
  public void addLast(E e){
	  arr_push(size,e);
  }
  
  //������Ԫ��ǰ���һ����Ԫ��
  public void addFirst(E e){
	  arr_push(0,e);
  }
  
  //��ȡIndex����λ�õ�Ԫ��
  public E get(int index){
	  if(is_empty()||is_full())
		  throw new IllegalArgumentException("get failed!");
	  return data[index];
  }
  
  public E getLast(){
	  return get(size-1);
  }
  
  public E getFirst(){
	  return  get(0);
  }

  //�޸�index����λ�õ�Ԫ��Ϊe
  public void set(int index,E e){
	  if(is_empty()||is_full())
		  throw new IllegalArgumentException("set failed!");
	  data[index]=e;
  }
  
  //�����������Ƿ���Ԫ��e
  public boolean contains(E e){
	  for(int i=0;i<size;i++){
		  if(data[i].equals(e))
		  return true;
	  }
	  return false;
  }
  
  //����������Ԫ��e���ڵ����������������Ԫ��e������-1
  public int find(E e){
	  for(int i=0;i<size;i++){
		  if(data[i].equals(e))
		  return i;
	  }
	  return -1;
  }
  
  //��������ɾ��indexλ�õ�Ԫ�أ�����ɾ����Ԫ��
  public E remove(int index){
	  if(is_empty()||is_full())
		  throw new IllegalArgumentException("remove failed!");
	  
	  E ret=data[index];
	  for(int i=index+1;i<size;i++)
		  data[i-1]=data[i];
	  size--;
	  data[size]=null;
	  
	  if(size==data.length/4 &&data.length/2!=0)
		  resize(data.length/2);
	  return ret;
  }
  
  //��������ɾ����һ��Ԫ�أ�����ɾ����Ԫ��
  public E removeFirst(){
	  return remove(0);
  }
  
  //��������ɾ�����һ��Ԫ�أ�����ɾ����Ԫ��
  public E removeLast(){
	  return remove(size-1);
  }
  
  //������ֻɾ��Ԫ��e
  public void removeElement(E e){
	  int index=find(e);
	  if(index!=-1)
		  remove(index);
  }
  
  public String toString(){
	  StringBuilder res=new StringBuilder();
	  res.append(String.format("Array:size=%d,capacity=%d\n", size,data.length));
	  res.append('[');
	  for(int i=0;i<size;i++){
		  res.append(data[i]);
		  if(i!=size-1)
			  res.append(", ");
	  }
	  res.append(']');
      return res.toString();
  }
  
  //������ռ���������newCapaCity��С
  @SuppressWarnings({ "unchecked", "unused" })
private void resize1(int newCapacity){
	  
	  E[]newData=(E[])new Object[newCapacity];
	  for(int i=0;i<size;i++)
		  newData[i]=data[i];
	  data = newData;
  }
}







