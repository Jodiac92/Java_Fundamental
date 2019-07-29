package Java_20190729;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.1);
		System.out.println(d1);
		
		d1 = Math.floor(4.9);
		System.out.println(d1);
		
		double d2 = 42.789;
		
		double a1 = Math.round(d2*1000); //소수점 3자리까지 나오게 하는 방법.
		System.out.println(a1/1000); //다른방법 System.out.printf("%.2f",d2);
		
		double d4 = Math.sqrt(4);
		System.out.println(d4);
		
		double d5 = Math.pow(2, 50);
		System.out.println(d5);
		
		double d6 = Math.random();
		System.out.println(d6);
	}
}
