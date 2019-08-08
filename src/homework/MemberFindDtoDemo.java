package homework;

public class MemberFindDtoDemo {
	public static void main(String[] args) {
		//1객체를 생성한다
		MemberFindDto m1 = new MemberFindDto(1,"hohotto@naver.com","111","2019-08-08","2019-08-09");
		//2객체의 내용을 출력해본다
		System.out.println(m1.getSeq());
		System.out.println(m1.getEmail());
		System.out.println(m1.getcode());
		System.out.println(m1.getSdate());
		System.out.println(m1.getEdate());
		//3객체의 내용을 수정해본다
		//4객체의 내용을 출력해본다
		//1,2,3,4
		MemberFindDto m2 = new MemberFindDto(2,"hohotto2@naver.com","222","2019-08-02","2019-08-03");
	}
}
