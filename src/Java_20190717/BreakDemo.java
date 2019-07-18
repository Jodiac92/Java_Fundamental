package Java_20190717;

public class BreakDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 6) break; {
				sum = sum + i;
			}
		}
		System.out.printf("1부터 10까지 짝수의 합은 %d 입니다.\n", sum);

		outter : for (int first = 2; first <= 9; first++) {
			for (int second = 1; second <= 9; second++) {
				if(first==4 && second==8) break outter;
				System.out.printf("%d * %d = %d\n", first, second, first * second);
			}
		}
	
	}
}