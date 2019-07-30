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
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);
		
		
		
	}
}
