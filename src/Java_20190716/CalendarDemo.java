package Java_20190716;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		
		-달력 만들기
		1. 1년 1월 1일 월요일
		2. 1년 365일 이고, 윤년일때는 366일 - 2월 29일
		3. 윤년은 4년마다 발생하고 그 중에서 100의 배수는 제외하고 400의 배수는 제외하지 않는다.
		4. 2019년 12월 25일은 무슨 요일일까요?
		5. 2018년까지 총일수, 11월까지 총일수, 25일 더해서 7로 나눈 나머지가 1이면 월요일 2이면 화요일...
		*/
		
		int year = 2020;
		int month = 3;
		int day = 15;
		//preYear => 2018년도
		int preYear = year - 1;
		//preMonth => 2019년도 11월
		int preMonth = month - 1;
		int totalCount = 0;
		
		//2018년도까지 총 일수 구하기
		totalCount = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		//2019년도  11월까지 합 구하기
		totalCount += 31 + 29;
		
		totalCount += day;
		
		int dayOfWeek = totalCount % 7;
		String message = null;
		if(dayOfWeek==1) {
			message = "월요일";
		}
		else if (dayOfWeek==2) {
			message = "화요일";
		}
		else if (dayOfWeek==3) {
			message = "수요일";
		}
		else if (dayOfWeek==4) {
			message = "목요일";
		}
		else if (dayOfWeek==5) {
			message = "금요일";
		}
		else if (dayOfWeek==6) {
			message = "토요일";
		}
		else if (dayOfWeek==0) {
			message = "일요일";
		}
		System.out.println(year+"년 "+ month + "월 "+ day+ "일 "+ message);
	}
}