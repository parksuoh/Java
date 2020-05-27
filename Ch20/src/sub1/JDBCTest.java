package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 	날짜 2020 05 26
 * 	이름 박수오
 * 	내용 JDBC 프로그래밍
 * 
 */
public class JDBCTest {
	
	public static void main(String[] args) throws Exception {
		
		//DB정보
		String host = "JDBC:mysql://192.168.44.7:3306/pso";
		String user = "pso";
		String pass = "1234";
		
		//1단계 - JDBC 드라이버 동적로드	
		Class.forName("com.mysql.jdbc.Driver");
		//2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		if(conn != null) {
			System.out.println("데이터베이스 접속 성공!");
		}
		
		
		//3단계
		//4단계
		//5단계
		
		//6단계 - 데이터베이스 종료
		conn.close();
		
		
	}
	
}
