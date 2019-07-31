package Java_20190731;

import java.util.ArrayList;

public class ExceptionDemo {
	public static void main(String[] args) {
		int i = Integer.parseInt("1111"); //111a => NumberFormatException
		System.out.println(i);
		
		int[] a = {1,2,3,4};
		System.out.println(a[3]);//a[4] => ArrayIndexOutOfBoundsException
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(list.get(1));//list.get(2) => IndexOutOfBoundsException
		
		//null => NullPointerException
		String str = "";
		System.out.println(str.length());
		
		//
		int b = 0;
		int c = 0;
		//분모가 0일 때 => ArithmeticException / by zero
		System.out.println(c/b);
		
	}
}
