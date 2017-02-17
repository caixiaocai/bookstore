package com.orilore.bizs;
import com.orilore.entitys.*;
import java.util.*;
public interface IUserBiz{
	public boolean addUser(User user);
	public boolean delUser(int id);
	public boolean updUser(User user);
	public User findUser(int id);
	public List<User> findUsers();
	public User login(String name,String password);
	public void close();
}