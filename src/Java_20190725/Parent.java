package Java_20190725;

public class Parent {	
	
	static int staticParent; //변수
	String name; //변수
	
	static {
		staticParent = 20;
		System.out.println("Parent static 초기화");
	}
	{ //instance범위
		System.out.println("Parent instance block");
	}
	public Parent() {
		System.out.println("Parent 생성자");

	}
}
