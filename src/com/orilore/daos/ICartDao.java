package com.orilore.daos;
import com.orilore.entitys.Cart;
import java.util.*;
import java.sql.*;
public interface ICartDao{
	public boolean addCart(Cart cart,Connection conn) throws Exception;
	public boolean delCart(int id,Connection conn) throws Exception;
	public boolean updCart(Cart cart,Connection conn) throws Exception;
	public Cart findCart(int id,Connection conn) throws Exception;
	public List<Cart> findCarts(Connection conn) throws Exception;
	public void close() throws Exception;
}