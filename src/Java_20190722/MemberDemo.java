package Java_20190722;

public class MemberDemo {
	public static void main(String[] args) {
		Member m = new Member();
		//m.name = "";
		m.setName("성영한");
		//System.out.println(m.name);
		m.setAddr1("서울");
		m.setSsn1("111111-111111");
		m.setAge(30);
		m.setRegdate("2019-07-22");
		
		System.out.println(m.getName());	
		System.out.println(m.getZipcode());
		System.out.println(m.getAddr1());
		System.out.println(m.getAge());
		System.out.println(m.getSsn1());
		System.out.println(m.getRegdate());
	
	}
}
