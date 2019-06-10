package std;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack ms= new MyStack();
		ms.push(10);
		ms.push(30);
		ms.push(40);
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		MyQueue mq= new MyQueue();
		mq.push(10);
		mq.push(30);
		mq.push(40);
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
	}

}
