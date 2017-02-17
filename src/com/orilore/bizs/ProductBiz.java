package com.orilore.bizs;
import com.orilore.daos.*;
import com.orilore.entitys.*;

import java.util.*;
import java.sql.*;
public class ProductBiz implements IProductBiz{
	private IProductDAO dao = new ProductDAO();
	private DBUtil db = new DBUtil();
	private Connection conn = null;
	public boolean addProduct(Product product){
		try{
			conn = db.getConnection();
			if(dao.addProduct(product,conn)){
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
	public boolean delProduct(int id){
		try{
			conn = db.getConnection();
			if(dao.delProduct(id,conn)){
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
	public boolean updProduct(Product product) {;
		try{
			conn = db.getConnection();
			if(dao.updProduct(product,conn)){
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
	public Product findProduct(int id){
		try{
			conn = db.getConnection();
			return dao.findProduct(id,conn);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
				return null;
		}finally{
			this.close();
		}
	}
	public List<Product> findProducts(){
		try{
			conn = db.getConnection();
			return dao.findProducts(conn);
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
	public void addCart(Cart cart, Connection conn) {
		// TODO Auto-generated method stub
		
	}
}
