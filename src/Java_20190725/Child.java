package Java_20190725;

public class Child extends Parent {	
	static int staticChild; //변수
	String phone; //변수
	
	static {
		staticChild = 200;
		System.out.println("Child static 초기화");
	}
	
	{
		System.out.println("Child instance block");
	}
	public Child() {
		System.out.println("Child 생성자");
	}
}
