package Java_20190812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class JdbcInsertDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Driver Load Success...");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Load Fail...");
		}
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kic?autoReconnect=true", "kic12", "kic12");//사용자, 비밀번호
			
			StringBuffer sql = new StringBuffer();
			sql.append("insert into member(num,name,addr)");
			sql.append("value (?,?,?)");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 12);
			pstmt.setString(2, "버그");
			pstmt.setString(3, "이스라엘");
			
			//sql문 전송
			//executeUpdate() => insert, update, delete문일 때 사용
			//반환값은 갱신된 행의 수를 반환한다.
			int resultCount = pstmt.executeUpdate();
			
			System.out.println("갱신된 행의 수 : "+resultCount);
			
			
			
			
			System.out.println("Connection success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
