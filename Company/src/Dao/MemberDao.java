package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Member;

public class MemberDao implements ImplDao {

	public static void main(String[] args) {
		System.out.println(new MemberDao().queryAll());
	
	
	}

	@Override
	public void add(Object o) {
		Member m=(Member)o;
		Connection conn = ImplDao.getDB();
		String sql="insert into member(username,password,name,address,phone,mobile)"
					+"values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,m.getUsername());
			ps.setString(2,m.getPassword());
			ps.setString(3,m.getName());
			ps.setString(4,m.getAddress());
			ps.setString(5,m.getPhone());
			ps.setString(6,m.getMobile());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Boolean queryUser(String username, String password) {
		Connection conn = ImplDao.getDB();
		String sql="select * from member where username=? and password=?";
		Boolean check=false;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			check=rs.next();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return check;
	}
	
	@Override
	public Boolean queryUser(String username) {
		Connection conn = ImplDao.getDB();
		String sql="select * from member where username=?";
		Boolean check=false;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,username);
			ResultSet rs=ps.executeQuery();
			check=rs.next();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return check;
	}

	@Override
	public String queryAll() {
		Connection conn=ImplDao.getDB();
		String show=
				"<table width=500 align=\"center\">" + 
				"<tr><td colspan=7 align=center><h3>會員資料</h3>"+		
				"<tr><td colspan=7><hr/>"+
				"<tr><td>ID<td>帳號<td>密碼<td>姓名<td>地址<td>電話<td>行動" + 
				"<tr><td colspan=7><hr/>"+
				"%s" + 
				"<tr><td colspan=7><hr/>"+
				"</table>";
		String all="";
		try {
			PreparedStatement ps=conn.prepareStatement("select * from member");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				all+="<tr><td>"+rs.getInt("id")
					+"<td>"+rs.getString("username")
					+"<td>"+rs.getString("password")
					+"<td>"+rs.getString("name")
					+"<td>"+rs.getString("address")
					+"<td>"+rs.getString("phone")
					+"<td>"+rs.getString("mobile");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return String.format(show,all);
	}
	
	
	
}

/*
		String sql="insert into member(username,password,name,address,phone,mobile)"
					+"values('aaa','1234','lll','adres','9285','0988')";
		try {
			Statement st = conn.createStatement();
			st.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
*/
