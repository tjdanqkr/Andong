package std;

public class MyStack extends Memory{
	
	private int top;

	private int maxSize;

	private Object[] stack;
	public int pop() {
		
		return arr[--index];
	}
		

	

	/*
	 * //�迭 ����, ���� ����
	 * 
	 * public MyStack(int maxSize) {
	 * 
	 * this.maxSize = maxSize;
	 * 
	 * this.stack = new Object[maxSize];
	 * 
	 * this.top = -1;
	 * 
	 * }
	 * 
	 * 
	 * 
	 * public boolean emtpy() {
	 * 
	 * return (top == -1);
	 * 
	 * }
	 * 
	 * 
	 * 
	 * public boolean full() {
	 * 
	 * return (top == maxSize-1);
	 * 
	 * }
	 * 
	 * // ���� ��ü �ֱ�
	 * 
	 * public void push(Object item) {
	 * 
	 * if(full()) {
	 * 
	 * throw new ArrayIndexOutOfBoundsException();
	 * 
	 * }
	 * 
	 * stack[++top] = item;
	 * 
	 * }
	 * 
	 * // ���� ��ü ����
	 * 
	 * public Object peek() {
	 * 
	 * if(emtpy()) {
	 * 
	 * throw new ArrayIndexOutOfBoundsException();
	 * 
	 * }
	 * 
	 * return stack[top];
	 * 
	 * }
	 * 
	 * // ���� ��ü ����
	 * 
	 * public Object pop() {
	 * 
	 * Object item = peek();
	 * 
	 * 
	 * 
	 * top--;
	 * 
	 * 
	 * 
	 * return item;
	 * 
	 * }
	 */

}
