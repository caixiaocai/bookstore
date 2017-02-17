package com.orilore.bizs;
import com.orilore.entitys.*;
import java.util.*;
public interface IDetailBiz{
	public boolean addDetail(Detail detail);
	public boolean delDetail(int id);
	public boolean updDetail(Detail detail);
	public Detail findDetail(int id);
	public List<Detail> findDetails();
	public void close();
}