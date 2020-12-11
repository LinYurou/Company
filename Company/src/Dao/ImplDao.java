package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ImplDao {
	//�s�uDatabase
	static Connection getDB() {
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="1234";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
		}catch(ClassNotFoundException e) {
			System.out.println("No Driver");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("No Connection");
			e.printStackTrace();
		}
		
		
		return conn;
	}
	
	//C:�s�W
	void add(Object o);
	
	//R:�d��
	Boolean queryUser(String username,String password);
	Boolean queryUser(String username);
	String queryAll();
	
	//U:�ק�
	
	
	//D:�R��
	
	
}
