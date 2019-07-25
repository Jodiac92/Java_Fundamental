package Java_20190725;

public class ShapeDemo {
	
	public static void run(Shape s) { // 추상 클래스의 다양성.
		s.draw();
	}
	
	public static void main(String[] args) {
		//추상 클래스는 객체를 생성할 수 없음.
		//Shape s = new Shape();
		//Rectangle r = new Rectangle();
		//Shape s1 = r;
		//Shape s1 = new Rectangle();
		//s1.draw();
		
		run(new Rectangle());
		
		//Shape s2 = new Circle();
		//s2.draw();
		run(new Circle());
	}
}
