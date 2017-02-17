package com.orilore.bizs;
import com.orilore.entitys.*;
import java.util.*;
public interface IUorderBiz{
	public boolean addUorder(Uorder uorder);
	public boolean delUorder(int id);
	public boolean updUorder(Uorder uorder);
	public Uorder findUorder(int id);
	public List<Uorder> findUorders();
	public void close();
}