package com.orilore.daos;
import com.orilore.entitys.Detail;
import java.util.*;
import java.sql.*;
public interface IDetailDAO{
	public boolean addDetail(Detail detail,Connection conn) throws Exception;
	public boolean delDetail(int id,Connection conn) throws Exception;
	public boolean updDetail(Detail detail,Connection conn) throws Exception;
	public Detail findDetail(int id,Connection conn) throws Exception;
	public List<Detail> findDetails(Connection conn) throws Exception;
	public void close() throws Exception;
}