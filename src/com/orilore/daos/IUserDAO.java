package com.orilore.daos;
import com.orilore.entitys.User;
import java.util.*;
import java.sql.*;
public interface IUserDAO{
	public boolean addUser(User user,Connection conn) throws Exception;
	public boolean delUser(int id,Connection conn) throws Exception;
	public boolean updUser(User user,Connection conn) throws Exception;
	public User findUser(int id,Connection conn) throws Exception;
	public List<User> findUsers(Connection conn) throws Exception;
	public User findUser(String name,String password,Connection conn) throws Exception;
	public void close() throws Exception;
}