package com.orilore.bizs;
import com.orilore.entitys.*;
import java.util.*;
public interface ICartBiz{
	public boolean addCart(Cart cart);
	public boolean delCart(int id);
	public boolean updCart(Cart cart);
	public Cart findCart(int id);
	public List<Cart> findCarts();
	public void close();
}