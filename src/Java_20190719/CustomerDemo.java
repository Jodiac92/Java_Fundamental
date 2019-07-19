package Java_20190719;

public class CustomerDemo {
	public static void main(String[] args) {
		//Customer 객체 생성
		//Customer => Object type
		//c1 => reference
		//new Customer() => Object
		Customer c1 = new Customer();
		c1.name = "조현기";
		c1.age = 28;
		c1.email = "fracasado76@gmail.com";
		c1.phone = "010-5133-5243";
		c1.balance = 23_000_000_000.23;
		c1.isReleased = false;
		
		System.out.printf("%s,%d,%s,%s,%,.2f,%s\n",
				c1.name,c1.age,c1.email,c1.phone,c1.balance,c1.isReleased);
		
		Customer c2 = new Customer();
		c2.name = "손정의";
		c2.age = 60;
		c2.email = "ceo@softbank.com";
		c2.phone = "010-9999-0000";
		c2.balance = 45_000_000_000.24;
		c2.isReleased = true;
		
		System.out.printf("%s,%d,%s,%s,%,.2f,%s",
				c2.name,c2.age,c2.email,c2.phone,c2.balance,c2
				.isReleased);
		
	}
}
