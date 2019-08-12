package Java_20190812;

import Java_20190812.MemberDao;
import Java_20190812.MemberDto;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao mdao = MemberDao.getInstance();
		MemberDto m1 = new MemberDto(22,"트럼프","미국");
		boolean isSuccess = mdao.insert(m1);
		if(isSuccess) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}
}
