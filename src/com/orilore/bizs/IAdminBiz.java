package com.orilore.bizs;
import com.orilore.entitys.*;
import java.util.*;
public interface IAdminBiz{
	public boolean addAdmin(Admin admin);
	public boolean delAdmin(int id);
	public boolean updAdmin(Admin admin);
	public Admin findAdmin(int id);
	public List<Admin> findAdmins();
	public void close();
}