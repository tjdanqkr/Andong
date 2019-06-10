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
	 * //배열 생성, 스택 생성
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
	 * // 스택 객체 넣기
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
	 * // 스택 객체 선택
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
	 * // 스택 객체 빼기
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
