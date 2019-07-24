package Java_20190724;

public class Box {
	int width; //멤버변수
	int height;
	int depth;
	//final변수는 멤버변수 위치에서 초기화해야 함.
	//한번 정해지면 변경불가.
	//final변수명은 대문자로 하는 것이 관례.final변수는 변수의 특성상 인스턴스 변수로 처리하지 않고 static변수로 처리함.
	static final String NAME = "BOX박스";
	
	public void change(Box b) { //문장 전체를 메서드, (Box b) = 매개변수
		//메서드 내에서 매개변수를 포함한 사용자가 정의한 변수를 지역변수라고 한다.
		//지역변수는 자동으로 초기화 되지 않기 때문에 기본값을 저장하고 사용한다.
		//지역변수의 유효범위는 메서드 내에서만 사용가능.
		int test = 0; //지역변수
		String str = null;
		double d = 0.0;
		
		System.out.println(width);
		System.out.println(test);
		b.depth = 3000;
	
	}
	
}
