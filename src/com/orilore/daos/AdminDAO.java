package com.orilore.daos;
import com.orilore.entitys.Admin;
import java.sql.*;
import java.util.*;
public class AdminDAO implements IAdminDAO{
	private PreparedStatement pstmt;
	private ResultSet rs;
	public boolean addAdmin(Admin admin,Connection conn) throws Exception{
		String sql="insert into admin(id,username,password,loginip,logintime) values(?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,admin.getId());		pstmt.setString(2,admin.getUsername());		pstmt.setString(5,admin.getLogintime());		pstmt.setString(3,admin.getPassword());		pstmt.setString(4,admin.getLoginip());		if(pstmt.executeUpdate()>0){
			this.close();
			return true;
		}else{
			this.close();
			return false;
		}
	}
	public boolean delAdmin(int id,Connection conn) throws Exception{
		String sql = "delete from admin where id=?";
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
	public boolean updAdmin(Admin admin,Connection conn) throws Exception{;
		String sql="update admin set id=?,username=?,password=?,loginip=?,logintime=? where id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,admin.getId());		pstmt.setString(2,admin.getUsername());		pstmt.setString(3,admin.getLogintime());		pstmt.setString(4,admin.getPassword());		pstmt.setString(5,admin.getLoginip());		if(pstmt.executeUpdate()>0){
			this.close();
			return true;
		}else{
			this.close();
			return false;
		}
	}
	public Admin findAdmin(int id,Connection conn) throws Exception{
		String sql = "select * from admin where id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,id);		rs = pstmt.executeQuery();
		Admin admin = new Admin();
		if(rs.next()){
			admin.setId(rs.getInt("id"));
			admin.setUsername(rs.getString("username"));
			admin.setLogintime(rs.getString("logintime"));
			admin.setPassword(rs.getString("password"));
			admin.setLoginip(rs.getString("loginip"));
		}
		this.close();
		return admin;
	}
	public List<Admin> findAdmins(Connection conn) throws Exception{
		String sql = "select * from admin";
		pstmt = conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		List<Admin> admins = new ArrayList<Admin>();
		while(rs.next()){
			Admin admin = new Admin();
			admin.setId(rs.getInt("id"));
			admin.setUsername(rs.getString("username"));
			admin.setLogintime(rs.getString("logintime"));
			admin.setPassword(rs.getString("password"));
			admin.setLoginip(rs.getString("loginip"));
			admins.add(admin);
		}
		this.close();
		return admins;
	}
	public void close() throws Exception{
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
	}
}