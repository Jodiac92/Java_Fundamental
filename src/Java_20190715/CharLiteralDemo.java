package Java_20190715;

public class CharLiteralDemo {
	public static void main(String[] args) {
		char c1 = '\uC870';
		char c2 = '\uD604';
		char c3 = '\uAE30';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//char literal의 아스키코드 표현 => 65
		
		char c4 = 65;
		System.out.println(c4);
		
		//char literal의 문자표현 => ''
		
		char c5 = 'q';
		
		System.out.println(c5);
		
		char c6 = '\\';
		System.out.println(c6);
		
		//특수문자
		// \n => line feed
		// \t => tab
		// \\ => back slash
		// \' => single quotation
		// \" => double quotation
		
		String path = "aa\nbb";
		
		System.out.println(path);
	}

}