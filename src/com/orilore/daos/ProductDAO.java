package com.orilore.daos;
import com.orilore.entitys.Product;
import java.sql.*;
import java.util.*;
public class ProductDAO implements IProductDAO{
	private PreparedStatement pstmt;
	private ResultSet rs;
	public boolean addProduct(Product product,Connection conn) throws Exception{
		String sql="insert into product(id,name,price,discount,picture,info,status,) values(?,?,?,?,?,?,?,)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(5,product.getPicture());
		
			this.close();
			return true;
		}else{
			this.close();
			return false;
		}
	}
	public boolean delProduct(int id,Connection conn) throws Exception{
		String sql = "delete from product where id=?";
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
	public boolean updProduct(Product product,Connection conn) throws Exception{;
		String sql="update product set id=?,name=?,price=?,discount=?,picture=?,info=?,status=? where id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,product.getPicture());
			this.close();
			return true;
		}else{

			return false;
		}
	}
	public Product findProduct(int id,Connection conn) throws Exception{
		String sql = "select * from product where id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,id);
		Product product = new Product();
		if(rs.next()){
			product.setPicture(rs.getString("picture"));
			product.setId(rs.getInt("id"));
			product.setPrice(rs.getFloat("price"));
			product.setStatus(rs.getInt("status"));
			product.setName(rs.getString("name"));
			product.setInfo(rs.getString("info"));
			product.setDiscount(rs.getFloat("discount"));
		}
		this.close();
		return product;
	}
	public List<Product> findProducts(Connection conn) throws Exception{
		String sql = "select * from product";
		pstmt = conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		List<Product> products = new ArrayList<Product>();
		while(rs.next()){
			Product product = new Product();
			product.setPicture(rs.getString("picture"));
			product.setId(rs.getInt("id"));
			product.setPrice(rs.getFloat("price"));
			product.setStatus(rs.getInt("status"));
			product.setName(rs.getString("name"));
			product.setInfo(rs.getString("info"));
			product.setDiscount(rs.getFloat("discount"));
			products.add(product);
		}
		this.close();
		return products;
	}
	public void close() throws Exception{
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
	}
}