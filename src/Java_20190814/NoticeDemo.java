package Java_20190814;

import java.util.ArrayList;

public class NoticeDemo {
	public static void main(String[] args) {
		NoticeDao dao = NoticeDao.getInstance();
		
		boolean isSuccess = dao.insert(new NoticeDto(3,"조현기3","제목3","내용3","2019-08-14"));
		if(isSuccess) {
			System.out.println("추가되었습니다");
		}else {
			System.out.println("오류");
		}
		
		isSuccess = dao.update(new NoticeDto(3,"조현귀2","엄목3","용내3","2018-08-14"));
		if(isSuccess) {
			System.out.println("수정되었습니다");
		}else {
			System.out.println("수정오류");
		}
		
		isSuccess = dao.delete(13);
		if(isSuccess) {
			System.out.println("삭제되었습니다");
		}else {
			System.out.println("삭제오류");
		}
		
		ArrayList<NoticeDto> list = dao.select();
		
		for(NoticeDto n: list) {
			int num = n.getNum();
			String writer = n.getWriter();
			String title = n.getTitle();
			String content = n.getContent();
			String regdate = n.getRegdate();
			System.out.printf("%d, %s, %s, %s, %s", num,writer,title,content,regdate);
		}
	}
}
