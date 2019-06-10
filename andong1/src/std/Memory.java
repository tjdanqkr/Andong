<<<<<<< HEAD
package std;

public class Memory implements MyStack,MyQueue{

	@Override
	public void push() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		
	}

}
=======
package std;

public class Memory {
	protected int []arr;
	protected int index;
	public Memory() {
		arr= new int [5];
		index= 0;
	}
	public Memory(int count) {
		arr= new int[count];
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public void push(int i) {
		arr[index++]= i;
	}
	public int pop() {
		
		return -1;
	}
	

}
>>>>>>> parent of 7f20ea8... Initial commit
