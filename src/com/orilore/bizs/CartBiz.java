package com.orilore.bizs;
import com.orilore.daos.*;
import com.orilore.entitys.*;
import java.util.*;
import java.sql.*;
public class CartBiz implements ICartBiz{
	private ICartDao dao = new CartDao();
	private DBUtil db = new DBUtil();
	private Connection conn = null;
	public boolean addCart(Cart cart){
		try{
			conn = db.getConnection();
			if(dao.addCart(cart,conn)){
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
	public boolean delCart(int id){
		try{
			conn = db.getConnection();
			if(dao.delCart(id,conn)){
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
	public boolean updCart(Cart cart) {;
		try{
			conn = db.getConnection();
			if(dao.updCart(cart,conn)){
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
	public Cart findCart(int id){
		try{
			conn = db.getConnection();
			return dao.findCart(id,conn);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
				return null;
		}finally{
			this.close();
		}
	}
	public List<Cart> findCarts(){
		try{
			conn = db.getConnection();
			return dao.findCarts(conn);
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
