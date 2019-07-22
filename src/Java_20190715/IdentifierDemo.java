//특수문자 중에 $,_는 사용할 수 있음
package Java_20190715;
//클래스명의 첫 글자는 대문자
//두 단어가 합친 경우에는 두 번째 단어의 첫 글자는 대문자로 사용
//(camel case)
public class IdentifierDemo {
	public static void main(String[] args) {
		int age = 10;
		String name = "Hello";
		//첫글자로 숫자를 사용할 수 없음
		//String 1fathername = "John";
		//공백을 사용할 수 없음
		//String mother Name ="Michell";
		//예약어는 변수(식별자)로 사용할 수 없음
		//String void = "empty";
		//자바는 유니코드를 지원하기 때문에 한글도 식별자로 사용 가능하지만 쓰지 않는 게 좋음.
		String 이름 = "성영한";
		System.out.println(이름);
	}
}
