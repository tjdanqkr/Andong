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
