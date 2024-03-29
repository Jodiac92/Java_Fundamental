package Java_20190715;

public class CastingDemo {
	public static void main(String[] args) {
		//overflow 발생하여 컴파일 에러
		//byte b1 = 250;
		
		byte b1 = (byte)250;//circuit 발생, 권장하지 않음
		System.out.println(b1);
		
		int i1 = (int)123.45;//cut 발생
		System.out.println(i1);
		
		double d1 = 123.45f;//자동 형변환(d가f보다 크기때문)
		
		byte b2 = 10;
		byte b3 = 20;
		//산술연사자는 변환값이 int이기 때문에 전체를 byte로
		//형변환해야 에러가 발생하지 않음.
		byte b4 = (byte)(b2 + b3);
	}

}
