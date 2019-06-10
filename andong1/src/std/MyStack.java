<<<<<<< HEAD
<<<<<<< HEAD
package std;

public interface MyStack {
	
	public void push();
	public void pop();
}
=======
package std;

public class MyStack extends Memory{
	
	private int top;

	private int maxSize;

	private Object[] stack;
	public int pop() {
		
		return arr[--index];
	}
		

	

	/*
	 * //¹è¿­ »ı¼º, ½ºÅÃ »ı¼º
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
	 * // ½ºÅÃ °´Ã¼ ³Ö±â
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
	 * // ½ºÅÃ °´Ã¼ ¼±ÅÃ
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
	 * // ½ºÅÃ °´Ã¼ »©±â
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
>>>>>>> parent of 7f20ea8... Initial commit
=======
package std;

public interface MyStack {
	
	public void push();
	public void pop();
}
>>>>>>> parent of 53c84ef... ìŠ¤íƒ í
