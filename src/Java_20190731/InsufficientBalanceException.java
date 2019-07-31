package Java_20190731;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
		//Exception클래스의 매개변수 String인 생성자를 호출
		//msg는 애러 메세지를 출력할 목적으로 사용한다.
		super(msg);
	}
}
