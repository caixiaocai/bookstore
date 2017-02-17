package com.orilore.bizs;
import com.orilore.daos.*;
import com.orilore.entitys.*;
import java.util.*;
import java.sql.*;
public class AdminBiz implements IAdminBiz{
	private IAdminDAO dao = new AdminDAO();
	private DBUtil db = new DBUtil();
	private Connection conn = null;
	public boolean addAdmin(Admin admin){
		try{
			conn = db.getConnection();
			if(dao.addAdmin(admin,conn)){
				return true;
			}else{
				return false;
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
				return false;
		}finally{
			this.close();
		}
	}
	public boolean delAdmin(int id){
		try{
			conn = db.getConnection();
			if(dao.delAdmin(id,conn)){
				return true;
			}else{
				return false;
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
				return false;
		}finally{
			this.close();
		}
	}
	public boolean updAdmin(Admin admin) {;
		try{
			conn = db.getConnection();
			if(dao.updAdmin(admin,conn)){
				return true;
			}else{
				return false;
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
				return false;
		}finally{
			this.close();
		}
	}
	public Admin findAdmin(int id){
		try{
			conn = db.getConnection();
			return dao.findAdmin(id,conn);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
				return null;
		}finally{
			this.close();
		}
	}
	public List<Admin> findAdmins(){
		try{
			return dao.findAdmins(conn);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
				return null;
		}finally{
			this.close();
		}
	}
	public void close(){
		try{
			if(conn!=null && !conn.isClosed())conn.close();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
