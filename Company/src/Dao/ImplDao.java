package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ImplDao {
	//連線Database
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
	
	//C:新增
	void add(Object o);
	
	//R:查詢
	Boolean queryUser(String username,String password);
	Boolean queryUser(String username);
	String queryAll();
	
	//U:修改
	
	
	//D:刪除
	
	
}
