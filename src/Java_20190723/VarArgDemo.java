package Java_20190723;

public class VarArgDemo {
	public long sum(int... temp) { //temp는 배열{(1,2), (1, 2, 3, 4)}
		long sum = 0;//지역변수, 유효범위는 메서드 내에서만 유효. /초기화 : 값을 처음으로 할당하는 작업/
		//temp[0]부터 [2]까지의 합.
		for(long t : temp) { //temp => t 
			sum += t; 
		}
		
		return sum;
	}	
	
	public static void main(String[] args) {
		VarArgDemo v1 = new VarArgDemo();
		
		long s1 = v1.sum(1, 2);
		System.out.println(s1);
		long s2 = v1.sum(1, 2, 3, 4);
		System.out.println(s2);
	}
	
	
}
