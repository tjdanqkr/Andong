package std;

public class MyQueue extends Memory{
	
	private int front;

	private int rear;

	private int maxSize;

	private Object[] queue;
	public MyQueue() {
		front=0;
	}
	public int pop() {
		
		return arr[front++];
	}

	/*
	 * // ó�� ť ����
	 * 
	 * public MyQueue(int maxSize) {
	 * 
	 * this.maxSize = maxSize;
	 * 
	 * this.front = 0;
	 * 
	 * this.rear = -1;
	 * 
	 * this.queue = new Object[maxSize];
	 * 
	 * }
	 * 
	 * 
	 * 
	 * // �����ִ��� Ȯ��
	 * 
	 * public boolean full() {
	 * 
	 * return (rear == maxSize-1);
	 * 
	 * }
	 * 
	 * // ����ִ��� Ȯ��
	 * 
	 * public boolean empty() {
	 * 
	 * return (front == rear+1);
	 * 
	 * }
	 * 
	 * // ť�� ��ü �ֱ�
	 * 
	 * public void push(Object item) {
	 * 
	 * if(full()) throw new ArrayIndexOutOfBoundsException();
	 * 
	 * 
	 * 
	 * queue[++rear] = item;
	 * 
	 * }
	 * 
	 * // ť ��ü ��������
	 * 
	 * public Object peek() {
	 * 
	 * if(empty()) throw new ArrayIndexOutOfBoundsException();
	 * 
	 * 
	 * 
	 * return queue[front];
	 * 
	 * }
	 * 
	 * // ť ��ü �����ϱ�
	 * 
	 * public Object pop() {
	 * 
	 * Object item = peek();
	 * 
	 * front++;
	 * 
	 * return item;
	 * 
	 * }
	 */

}
