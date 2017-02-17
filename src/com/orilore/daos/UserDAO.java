package com.orilore.daos;
import com.orilore.entitys.User;
import java.sql.*;
import java.util.*;
public class UserDAO implements IUserDAO{
	private PreparedStatement pstmt;
	private ResultSet rs;
	public boolean addUser(User user,Connection conn) throws Exception{
		String sql="insert into user(name,password,phone,address) values(?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(3,user.getPhone());		pstmt.setString(4,user.getAddress());		pstmt.setString(1,user.getName());		pstmt.setString(2,user.getPassword());		if(pstmt.executeUpdate()>0){
			this.close();
			return true;
		}else{
			this.close();
			return false;
		}
	}
	public boolean delUser(int id,Connection conn) throws Exception{
		String sql = "delete from user where id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,id);
		if(pstmt.executeUpdate()>0){
			this.close();
			return true;
		}else{
			this.close();
			return false;
		}
	}
	public boolean updUser(User user,Connection conn) throws Exception{;
		String sql="update user set name=?,password=?,phone=?,address=? where id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(5,user.getId());		pstmt.setString(3,user.getPhone());		pstmt.setString(4,user.getAddress());		pstmt.setString(1,user.getName());		pstmt.setString(2,user.getPassword());		if(pstmt.executeUpdate()>0){
			this.close();
			return true;
		}else{
			this.close();
			return false;
		}
	}
	public User findUser(int id,Connection conn) throws Exception{
		String sql = "select * from user where id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,id);		rs = pstmt.executeQuery();
		User user = new User();
		if(rs.next()){
			user.setId(rs.getInt("id"));
			user.setPhone(rs.getString("phone"));
			user.setAddress(rs.getString("address"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
		}
		this.close();
		return user;
	}
	public List<User> findUsers(Connection conn) throws Exception{
		String sql = "select * from user";
		pstmt = conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		List<User> users = new ArrayList<User>();
		while(rs.next()){
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setPhone(rs.getString("phone"));
			user.setAddress(rs.getString("address"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
			users.add(user);
		}
		this.close();
		return users;
	}
	public void close() throws Exception{
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
	}
	@Override
	public User findUser(String name, String password, Connection conn) throws Exception{
		String sql = "select * from user where name=? and password=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,name);
		pstmt.setString(2, password);
		rs = pstmt.executeQuery();
		User user = null;
		if(rs.next()){
			user = new User();
			user.setId(rs.getInt("id"));
			user.setPhone(rs.getString("phone"));
			user.setAddress(rs.getString("address"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
		}
		this.close();
		return user;
	}
}