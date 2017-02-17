package com.orilore.daos;
import com.orilore.entitys.Uorder;
import java.util.*;
import java.sql.*;
public interface IUorderDAO{
	public boolean addUorder(Uorder uorder,Connection conn) throws Exception;
	public boolean delUorder(int id,Connection conn) throws Exception;
	public boolean updUorder(Uorder uorder,Connection conn) throws Exception;
	public Uorder findUorder(int id,Connection conn) throws Exception;
	public List<Uorder> findUorders(Connection conn) throws Exception;
	public void close() throws Exception;
}