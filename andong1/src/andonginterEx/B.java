package andonginterEx;

public class B extends A{
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		B bb= new B("superman", 1000);
		/*
		 * bb.setName("superman"); bb.setAge(1000);
		 */
		/*
		 * System.out.println(bb.getName()); System.out.println(bb.getAge());
		 */
		System.out.println(bb.toString());
	}
	public B() {
		//super(); 호출
		System.out.println("b 생성자");
		
	}
	public B(String name,int age) {
		super(name);
		this.age = age;
		
	}
	//override
	public String toString() {
        return super.toString() + "\t"+getName() + "\t" + getAge();
    }
}
