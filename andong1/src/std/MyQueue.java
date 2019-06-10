<<<<<<< HEAD
package std;

public interface MyQueue {
	
	void push() ;
	void pop();
}
=======
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
	 * // 처음 큐 생성
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
	 * // 꽉차있는지 확인
	 * 
	 * public boolean full() {
	 * 
	 * return (rear == maxSize-1);
	 * 
	 * }
	 * 
	 * // 비어있는지 확인
	 * 
	 * public boolean empty() {
	 * 
	 * return (front == rear+1);
	 * 
	 * }
	 * 
	 * // 큐에 객체 넣기
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
	 * // 큐 객체 가져오기
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
	 * // 큐 객체 삭제하기
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
>>>>>>> parent of 7f20ea8... Initial commit
