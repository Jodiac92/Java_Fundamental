package Java_20190724;
//i18n => 국제어 = i 18(nternationalizatio) n
//l10n => 지역화 l 10(ocalizatio) n
public class InitializationDemo {
	int a;
	static int b;
	static final int C=10;
	//static초기화
	static {
		System.out.println("static area");
		b = 100;
	}
	
	//생성자에서 초기화 할 수 있는 변수는 instance변수만
	public InitializationDemo(int a) {
		//Super();
		this.a = a;
		
	}
	public static void main(String[] args) {
		System.out.println("main area");
		InitializationDemo i = new InitializationDemo(1000);
		System.out.println(i.a);
		System.out.println(b); 
		System.out.println(C);
	}
}
