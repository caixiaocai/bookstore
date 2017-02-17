package com.orilore.bizs;
import com.orilore.daos.*;
import com.orilore.entitys.*;
import java.util.*;
import java.sql.*;
public class DetailBiz implements IDetailBiz{
	private IDetailDAO dao = new DetailDAO();
	private DBUtil db = new DBUtil();
	private Connection conn = null;
	public boolean addDetail(Detail detail){
		try{
			conn = db.getConnection();
			if(dao.addDetail(detail,conn)){
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
	public boolean delDetail(int id){
		try{
			conn = db.getConnection();
			if(dao.delDetail(id,conn)){
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
	public boolean updDetail(Detail detail) {;
		try{
			conn = db.getConnection();
			if(dao.updDetail(detail,conn)){
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
	public Detail findDetail(int id){
		try{
			conn = db.getConnection();
			return dao.findDetail(id,conn);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
				return null;
		}finally{
			this.close();
		}
	}
	public List<Detail> findDetails(){
		try{
			return dao.findDetails(conn);
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
