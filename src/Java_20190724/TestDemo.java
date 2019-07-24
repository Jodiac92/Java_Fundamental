package Java_20190724;
import Java_20190724.aa.Test; //Test클래스를 import해서 사용하기 위해서는 Test클래스의 접근한정자는 public이어야한다.서로다른 패키지일때 import를 사용
public class TestDemo {
	//public TestDemo() {
		
	//}생성자
	int a;
	public static void main(String[] args) {
		Test t = new Test();
		
	}
}
