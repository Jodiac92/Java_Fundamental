package Java_20190724;

public class BoxDemo {
	int a;//객체생성을 하여 접근
	static int b;
	public static void main(String[] args) {
		b = 20;
		BoxDemo.b = 20;
		BoxDemo b= new BoxDemo(); //객체생성
		b.a = 10;
		//Box.NAME = "Box2";
		
		Box b1 = new Box();
		b1.width = 10;
		b1.height = 20;
		b1.depth = 30;
		
		Box b2 = new Box();
		b2.width = 10;
		b2.height = 20;
		b2.depth = 30;
		
		Box b3 = b2;//*비교
		
		// b1==b2 => reference비교일때에는 b1과 b2가 같은 오브젝트를 참조하면 true, 그렇지 않으면 false
		System.out.println(b3==b2);
		
		System.out.printf("width : %d, height : %d, depth : %d", b1.width, b1.height, b1.depth);
		
		b1.change(b1);//call by reference
		
		System.out.printf("width : %d, height : %d, depth : %d", b1.width, b1.height, b1.depth);
	}
}
