package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
* 	날짜 2020 05 26
* 	이름 박수오
* 	내용 JDBC DELETE 실습하기
* 
*/
public class DeleteTest {
	public static void main(String[] args) throws Exception {
		
		
		//DB정보
		String host = "JDBC:mysql://192.168.44.7:3306/pso";
		String user = "pso";
		String pass = "1234";
		
		
		//1단계 - JDBC드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		//2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
	
		
		//3단계 - SQL실행객체 생성
		Statement stmt = conn.createStatement();
		
		//4단계 - SQL실행
		String sql = "DELETE FROM `USER1` WHERE `uid` = '이몽룡'";
		stmt.executeUpdate(sql);
		
		//5단계 - 결과셋처리(SELECT일 경우)
		//6단계 - 데이터베이스 종료
		conn.close();
		
		System.out.println("지웠음");
	}
}
