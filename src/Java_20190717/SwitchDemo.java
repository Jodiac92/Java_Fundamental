package Java_20190717;

public class SwitchDemo {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]); // Run configurations => Arguments => Program arguments에 인자값을 넣는다.
		String season = null;
		// case의 평가값은 유일해야 한다.
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;

		case 3:
		case 4:
		case 5:
			season = "봄";
			break;

		case 6:
		case 7:
		case 8:
			season = "여름";
			break;

		case 9:
		case 10:
		case 11:
			season = "가을";
			break;

		default:
			season = "없는 계절";
		}
		System.out.printf("%d 월은 %s 입니다", month, season);
	}
}
