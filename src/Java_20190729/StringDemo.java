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
		char c = ssn.charAt(7); 
		System.out.println(c);
		
		ssn = ssn.concat("abcd");
		System.out.println(ssn);
		
		String fileName = "abd.asd.asd.fdf.dfd.doc";
		if(fileName.endsWith("zip")) {
			System.out.println("압축파일입니다.");		
		}else if(fileName.endsWith("doc")) {
			System.out.println("워드문서입니다.");			
		}else {
			System.out.println("파일입니다.");
		}
		
		System.out.println(fileName.equalsIgnoreCase("ABD.DOc"));
		
		int index = ssn.indexOf("-");
		
		System.out.println(index);
		
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));
		//111111-111118
		String first = fileName.substring(0,fileName.lastIndexOf("."));//String first = ssn.substring(0,6);//0은 포함하고 6은포함x 
		String second = fileName.substring(fileName.lastIndexOf(".")+1);//String second = ssn.substring(7);//7이상모두                  
		System.out.println(first);
		System.out.println(second);
		
		
		
	}
}
