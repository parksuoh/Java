package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 	��¥ 2020 05 26
 * 	�̸� �ڼ���
 * 	���� JDBC INSERT �ǽ��ϱ�
 * 
 */
public class InsertTest {
	public static void main(String[] args) throws Exception {
		
		//DB����
		String host = "JDBC:mysql://192.168.44.7:3306/pso";
		String user = "pso";
		String pass = "1234";
		
		//1�ܰ� - JDBC ����̹� �����ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		//2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		//3�ܰ� - SQL ���ఴü ����
		Statement stmt = conn.createStatement();
		
		//4�ܰ� - SQL ����
		String sql = "INSERT INTO `USER1` VALUES('J102','�����','010-1231-1111', 55)";
		stmt.executeUpdate(sql);
		
		//5�ܰ� - ����� ó��(SELECT�� ���)
		
		//6�ܰ� - �����ͺ��̽� ����(����)
		conn.close();
		
		System.out.println("INSERT �Ϸ� ...");
		
	}
}