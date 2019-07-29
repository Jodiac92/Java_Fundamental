package Java_20190729;
//ctl + shift + o
import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//자바 1.4이전 버전에서는 primitive data type을 collection에 저장 할 수 없었기 때문에 pdt(primitive data type을 collection)을 객체화 할 수 있는 Wrapper으로 변환하여 저장해야 한다.
		//Wrapper으로 변환하여 저장해야 한다. 아래와 같이 1을 add할 수 없음.
		//list.add(1)
		list.add(new Integer(1));
	
			//1. primitive data type => wrapper class(생성자)(생성자=>new Integer(10))
		Integer i2 = new Integer(10); //auto boxing
		Integer i3 = new Integer(20);
		
	
		//String => Wrapper class(Integer.valueOf("10))
		String s1 = "10";
		String s2 = "20";
		Integer i1 = Integer.valueOf(s1);
		
		
		//3. Wrapper class = primitive data type
		int temp = i2.intValue() + i3.intValue();
		
		//4. String => primitive data type(Integer.parseInt);***문자를 나열할 때 사용
		temp = Integer.parseInt(s1) + Integer.parseInt(s2);
		
		//5. primitive data type => String
		int a1 = 10;
		String s3 = String.valueOf(a1);
		System.out.println(s3);
		
		//auto boxing : primitive data type 자동으로 wrapper
		Integer i4 = 10;
		
		//auto unboxing : wrapper를 자동으로 primitive data type로 자동 변환
		
		int a2 = i2 + i3;
		System.out.println(a2);
		System.out.println(i2.equals(i3));
	
	}
	

	
}
