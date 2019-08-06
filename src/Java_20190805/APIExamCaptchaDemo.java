package Java_20190805;

import java.util.Scanner;

import bonus.Utility;

public class APIExamCaptchaDemo {
public static String console(String msg) {
	System.out.print(msg);
	Scanner sc = new Scanner(System.in);
	return sc.next();
}

	public static void main(String[] args) {
		String id = "MzN4ZMwT_thqj9exk3XQ";
		String secret = "iQQMi6i8V_";
		String key = Utility.getCaptchakey(id, secret);
		boolean isSuccess = Utility.isCaptchaImage(id,secret,key);
		if(isSuccess) {
			String value = console("이미지 결과값을 입력하세요>");
			boolean result = Utility.isCaptchaResult(id, secret, key, value);
		if(result) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
	 	}else {
		System.out.println("다시확인해");
	}
	}
}
