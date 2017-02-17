package com.orilore.bizs;
import com.orilore.entitys.*;

import java.sql.Connection;
import java.util.*;
public interface IProductBiz{
	public boolean addProduct(Product product);
	public boolean delProduct(int id);
	public boolean updProduct(Product product);
	public Product findProduct(int id);
	public List<Product> findProducts();
	public void close();
	public void addCart(Cart cart, Connection conn);
}