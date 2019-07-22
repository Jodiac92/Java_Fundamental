package Java_20190722;
import Java_20190719.Customer;
public class CustomerStaticDemo {
	public static void main(String[] args) {
		//static 변수는 클래스 이름으로 접근한다. 모든객체들이 공유할 수 있는 변수.
		Customer.interestRate = 3.7;
		
		Customer c1 = new Customer();
		c1.name = "홍길동";
		c1.age = 40;
		c1.email = "hong@test.com";
		c1.phone = "010-0000-0000";
		c1.balance = 1900000.43;
		c1.isReleased = false;
		//final 변수는 재할당 할 수 없음
		//Customer.BANKNAME = "국민은행";
		//static 변수는 클래스 이름으로 접근하는 것이 관례이지만 reference로도 접근이 가능하다(권장하지 않음)
		//c1.interestRate = 3.5;
		
		System.out.println(Customer.interestRate);
		System.out.println(Customer.BANKNAME); //Java_20190719에있는 Customer변수를 사용.
		
		Customer c2 = new Customer();
		c2.name = "조자룡";
		c2.age = 33;
		c2.email = "jj@test.com";
		c2.phone = "010-1111-0000";
		c2.balance = 3500000.43;
		c2.isReleased = false;
		
		System.out.println(Customer.interestRate);
		
		Customer c3 = new Customer();
		c3.name = "베조스";
		c3.age = 50;
		c3.email = "amazon@test.com";
		c3.phone = "010-1111-0000";
		c3.balance = 5000000.43;
		c3.isReleased = false;
		
		System.out.println(Customer.interestRate);
		
	}

}
