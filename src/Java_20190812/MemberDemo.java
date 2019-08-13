package Java_20190812;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao mdao = MemberDao.getInstance();
		MemberDto m1 = new MemberDto(99,"트럼프1","미국1");
		boolean isSuccess = mdao.insert(m1);
		/*if(isSuccess) {
			System.out.println("넣기성공");
		}else {
			System.out.println("넣기실패");
		}
		
		
		m1 = new MemberDto(23,"트럼프2","미국2");
		isSuccess = mdao.update(m1);
		if(isSuccess) {
			System.out.println("수정성공");
		}else {
			System.out.println("수정실패");
		}
		
		
	
	
	isSuccess = mdao.delete(20);
	if(isSuccess) {
		System.out.println("삭제성공");
	}else {
		System.out.println("삭제실패");
	}
	*/
	
	
	
	ArrayList<MemberDto> list = mdao.select();
	
	for(MemberDto m : list) {
		int num = m.getNum();
		String name =m.getName();
		String addr = m.getAddr();
		System.out.printf("%d\t%s\t%s%n", num,name,addr);
	}
	
	}
	
}
/*public boolean delete(int num) {
	Connection con = null;
	PreparedStatement pstmt = null;
	boolean isSuccess = false;
	int index = 1;
	try {
		
	} catch (SQLException e) {
		// TODO: handle exception
	} finally {
		try {
			
		} catch (SQLException e2) {
			// TODO: handle exception
		}
	}
	return isSuccess;
}*/
