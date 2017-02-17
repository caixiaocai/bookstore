package com.orilore.daos;
import com.orilore.entitys.Cart;
import java.sql.*;
import java.util.*;
public class CartDao implements ICartDao{
	private PreparedStatement pstmt;
	private ResultSet rs;
	public boolean addCart(Cart cart,Connection conn) throws Exception{
		String sql="insert into cart(username,bookname,num,price,discount) values(?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(3,"1");		pstmt.setString(1,cart.getUsername());		pstmt.setFloat(4,cart.getPrice());		pstmt.setString(2,cart.getBookname());		pstmt.setFloat(5,cart.getDiscount());		if(pstmt.executeUpdate()>0){
			this.close();
			return true;
		}else{
			this.close();
			return false;
		}
	}
	public boolean delCart(int id,Connection conn) throws Exception{
		String sql = "delete from cart where id=?";
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
	public boolean updCart(Cart cart,Connection conn) throws Exception{;
		String sql="update cart set Id=?,username=?,bookname=?,num=?,price=?,discount=? where id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,cart.getNum());		pstmt.setString(2,cart.getUsername());		pstmt.setFloat(3,cart.getPrice());		pstmt.setString(4,cart.getBookname());		pstmt.setInt(5,cart.getId());		pstmt.setFloat(6,cart.getDiscount());		if(pstmt.executeUpdate()>0){
			this.close();
			return true;
		}else{
			this.close();
			return false;
		}
	}
	public Cart findCart(int id,Connection conn) throws Exception{
		String sql = "select * from cart where id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,id);		rs = pstmt.executeQuery();
		Cart cart = new Cart();
		if(rs.next()){
			cart.setNum(rs.getString("num"));
			cart.setUsername(rs.getString("username"));
			cart.setPrice(rs.getFloat("price"));
			cart.setBookname(rs.getString("bookname"));
			cart.setId(rs.getInt("Id"));
			cart.setDiscount(rs.getFloat("discount"));
		}
		this.close();
		return cart;
	}
	public List<Cart> findCarts(Connection conn) throws Exception{
		String sql = "select * from cart";
		pstmt = conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		List<Cart> carts = new ArrayList<Cart>();
		while(rs.next()){
			Cart cart = new Cart();
			cart.setNum(rs.getString("num"));
			cart.setUsername(rs.getString("username"));
			cart.setPrice(rs.getFloat("price"));
			cart.setBookname(rs.getString("bookname"));
			cart.setId(rs.getInt("Id"));
			cart.setDiscount(rs.getFloat("discount"));
			carts.add(cart);
		}
		this.close();
		return carts;
	}
	public void close() throws Exception{
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
	}
}