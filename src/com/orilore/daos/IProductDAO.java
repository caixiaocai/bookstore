package com.orilore.daos;
import com.orilore.entitys.Product;
import java.util.*;
import java.sql.*;
public interface IProductDAO{
	public boolean addProduct(Product product,Connection conn) throws Exception;
	public boolean delProduct(int id,Connection conn) throws Exception;
	public boolean updProduct(Product product,Connection conn) throws Exception;
	public Product findProduct(int id,Connection conn) throws Exception;
	public List<Product> findProducts(Connection conn) throws Exception;
	public void close() throws Exception;
}