package com.orilore.daos;
import com.orilore.entitys.Admin;
import java.util.*;
import java.sql.*;
public interface IAdminDAO{
	public boolean addAdmin(Admin admin,Connection conn) throws Exception;
	public boolean delAdmin(int id,Connection conn) throws Exception;
	public boolean updAdmin(Admin admin,Connection conn) throws Exception;
	public Admin findAdmin(int id,Connection conn) throws Exception;
	public List<Admin> findAdmins(Connection conn) throws Exception;
	public void close() throws Exception;
}