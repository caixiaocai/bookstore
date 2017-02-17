package com.orilore.bizs;
import com.orilore.daos.*;
import com.orilore.entitys.*;

import java.util.*;
import java.sql.*;
public class UserBiz implements IUserBiz{
	private IUserDAO dao = new UserDAO();
	private DBUtil db = new DBUtil();
	private Connection conn = null;
	public boolean addUser(User user){
		try{
			conn = db.getConnection();
			if(dao.addUser(user,conn)){
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
	public boolean delUser(int id){
		try{
			conn = db.getConnection();
			if(dao.delUser(id,conn)){
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
	public boolean updUser(User user) {;
		try{
			conn = db.getConnection();
			if(dao.updUser(user,conn)){
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
	public User findUser(int id){
		try{
			conn = db.getConnection();
			return dao.findUser(id,conn);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
				return null;
		}finally{
			this.close();
		}
	}
	public List<User> findUsers(){
		try{
			return dao.findUsers(conn);
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
	@Override
	public User login(String name, String password) {
		try{
			conn = db.getConnection();
			return dao.findUser(name,password,conn);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			return null;
		}finally{
			this.close();
		}
	}
}
