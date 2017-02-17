package com.orilore.bizs;
import com.orilore.daos.*;
import com.orilore.entitys.*;
import java.util.*;
import java.sql.*;
public class UorderBiz implements IUorderBiz{
	private IUorderDAO dao = new UorderDAO();
	private DBUtil db = new DBUtil();
	private Connection conn = null;
	public boolean addUorder(Uorder uorder){
		try{
			conn = db.getConnection();
			if(dao.addUorder(uorder,conn)){
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
	public boolean delUorder(int id){
		try{
			conn = db.getConnection();
			if(dao.delUorder(id,conn)){
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
	public boolean updUorder(Uorder uorder) {;
		try{
			conn = db.getConnection();
			if(dao.updUorder(uorder,conn)){
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
	public Uorder findUorder(int id){
		try{
			conn = db.getConnection();
			return dao.findUorder(id,conn);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
				return null;
		}finally{
			this.close();
		}
	}
	public List<Uorder> findUorders(){
		try{
			return dao.findUorders(conn);
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
