<<<<<<< HEAD
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
=======
package std;

import java.util.Scanner;

public class MainClass {
	
	static int a;
	
	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		MainClass.a = a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Memory mem;
		MyStack ms = new MyStack();
		MyQueue mq= new MyQueue();
		int index=0,index1=0;
		while(true) {
			System.out.println("1.stack 2. queue");
			index= sc.nextInt();
			if(index==1) {
				mem=ms;
			}else {
				mem=mq;
			}while(true) {
				System.out.println("1.push 2. pop 3. ³¡");
				index1=sc.nextInt();
				if(index1==1) {
					mem.push(sc.nextInt());
				}else if(index1==2) {
					System.out.println(mem.pop());
				}else {
					break;
				}
			}
			
		}
		
		
		/*
		 * ms.push(10); ms.push(20); ms.push(30); System.out.println(ms.pop());
		 * System.out.println(ms.pop()); System.out.println(ms.pop());
		 * 
		 * mq.push(10); mq.push(20); mq.push(30); System.out.println(mq.pop());
		 * System.out.println(mq.pop()); System.out.println(mq.pop());
		 */
		
		/*
		 * MyStack ms= new MyStack(3); Scanner sc= new Scanner(System.in);
		 * setA(sc.nextInt()); sc.close(); ms.push(getA()); ms.push(30); ms.push(40);
		 * System.out.println(ms.pop()); System.out.println(ms.pop());
		 * System.out.println(ms.pop()); MyQueue mq= new MyQueue(3); mq.push(10);
		 * mq.push(30); mq.push(40); System.out.println(mq.pop());
		 * System.out.println(mq.pop()); System.out.println(mq.pop());
		 */
	}

}
>>>>>>> parent of 7f20ea8... Initial commit
