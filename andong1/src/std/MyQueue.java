<<<<<<< HEAD
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
	 * // Ã³À½ Å¥ »ı¼º
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
	 * // ²ËÂ÷ÀÖ´ÂÁö È®ÀÎ
	 * 
	 * public boolean full() {
	 * 
	 * return (rear == maxSize-1);
	 * 
	 * }
	 * 
	 * // ºñ¾îÀÖ´ÂÁö È®ÀÎ
	 * 
	 * public boolean empty() {
	 * 
	 * return (front == rear+1);
	 * 
	 * }
	 * 
	 * // Å¥¿¡ °´Ã¼ ³Ö±â
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
	 * // Å¥ °´Ã¼ °¡Á®¿À±â
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
	 * // Å¥ °´Ã¼ »èÁ¦ÇÏ±â
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
=======
package std;

public interface MyQueue {
	
	void push() ;
	void pop();
}
>>>>>>> parent of 53c84ef... ìŠ¤íƒ í
