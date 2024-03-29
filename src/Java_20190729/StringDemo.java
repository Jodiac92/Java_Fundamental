package Java_20190729;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("test");
		String s2 = new String("test");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		String ssn = "111111-111118";
		//charAt(int index) : 문자열중에서 특정 index에 있는 문자를 변환한다.
		//시작 index는 0부터 
		char c = ssn.charAt(7); 
		System.out.println(c);
		
		//concat(String msg) : 문자열 연결
		ssn = ssn.concat("abcd");
		System.out.println(ssn);
		
		String fileName = "abd.asd.asd.fdf.dfd.doc";
		//endWith(String msg) msg문자열로 끝나면 true, 그렇지 않으면 false
		if(fileName.endsWith("zip")) {
			System.out.println("압축파일입니다.");		
		}else if(fileName.endsWith("doc")) {
			System.out.println("워드문서입니다.");			
		}else {
			System.out.println("파일입니다.");
		}
		
		
		//equalsIngnoreCase(String msg) : 대소문자를 구분하지 않고 문자열을 비교하여 같으면 true, or false
		System.out.println(fileName.equalsIgnoreCase("ABD.DOc"));
		
		//indexOf(String msg) : msg문자열의 위치를 반환한다.
		//msg문자열을 찾을 때 끝에서 찾고 index는 처음부터 시작한다.
		int index = ssn.indexOf("-");
		
		System.out.println(index);
		
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));
		//111111-111118
		//substring(int first, int second)
		//first(포함), second(를 포함 하지 않음) 사이의 문자열을 추출한다.
		//substring(int firtst)
		//first(포함)보다 큰 모든 문자열을 추출한다.
		String first = fileName.substring(0,fileName.lastIndexOf("."));//String first = ssn.substring(0,6);//0은 포함하고 6은포함x 
		String second = fileName.substring(fileName.lastIndexOf(".")+1);//String second = ssn.substring(7);//7이상모두                  
		System.out.println(first);
		System.out.println(second);
		
		String html = "안녕하세요\n저는 성영한입니다.\n잘 부탁드립니다.";
		//replaceAll(String first, String second)
		//first 문자열을 second 문자열로 대체한다.
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);
		
		
		String url = "http://www.naver.com";
		String path = "/news";
		//startsWith(String msg) msg문자열로 시작하면 true, or false
		if(path.startsWith("/news")){
			System.out.println("뉴스 페이지입니다.");
		}else if(path.startsWith("/sports")){
			System.out.println("스포츠 페이지입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		String m1 = "hello";
		String m2 = "hello ";
		
		System.out.println(m1);
		System.out.println(m2);
		if(m1.equals(m2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//toUpperCase() 대문자로 변환
		m1 = m1.toUpperCase();
		System.out.println(m1);
		
		//toLowerCase() 소문자로 변환
		m1 = m1.toLowerCase();
		System.out.println(m1);
		
		//String.valueOf() : primitive data type을 문자열로 변환한다.
		int a = 10;
		String str = String.valueOf(a);
		System.out.println(a);
		
		char[] c1 = {'a', 'b', 'c'};
		String str1 = String.valueOf(c1);
		System.out.println(c1);
		
		//ssn : 111111-111118                //11111토큰-구분자111118토큰
		//split(String delimiter)
		//문자열을 구분자(delimiter)로 토큰(token)화 시키는 메서드 
		String[] strArray = ssn.split("-");  // ex)"111#222#333 => 숫자=토큰, #=구분자
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		
		String str2 = String.format("%,d", 1000000); //d는 decimal
		System.out.println(str2);
		
		str2 = String.format("%,.2f", 1234.12423); //f는 float
		System.out.println(str2);
	}
	
}
