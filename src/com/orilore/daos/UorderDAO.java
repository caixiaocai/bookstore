package com.orilore.daos;
import com.orilore.entitys.Uorder;
import java.sql.*;
import java.util.*;
public class UorderDAO implements IUorderDAO{
	private PreparedStatement pstmt;
	private ResultSet rs;
	public boolean addUorder(Uorder uorder,Connection conn) throws Exception{
		String sql="insert into uorder(id,code,uid,odate,person,phone,address,total,status) values(?,?,?,?,?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setFloat(8,uorder.getTotal());		pstmt.setInt(3,uorder.getUid());		pstmt.setInt(1,uorder.getId());		pstmt.setString(6,uorder.getPhone());		pstmt.setString(5,uorder.getPerson());		pstmt.setInt(9,uorder.getStatus());		pstmt.setString(7,uorder.getAddress());		pstmt.setString(4,uorder.getOdate());		pstmt.setString(2,uorder.getCode());		if(pstmt.executeUpdate()>0){
			this.close();
			return true;
		}else{
			this.close();
			return false;
		}
	}
	public boolean delUorder(int id,Connection conn) throws Exception{
		String sql = "delete from uorder where id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,id);
		if(pstmt.executeUpdate()>0){
			this.close();
			return true;
		}else{
			this.close();
			return false;
		}
	}
	public boolean updUorder(Uorder uorder,Connection conn) throws Exception{;
		String sql="update uorder set id=?,code=?,uid=?,odate=?,person=?,phone=?,address=?,total=?,status=? where id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setFloat(1,uorder.getTotal());		pstmt.setInt(2,uorder.getUid());		pstmt.setInt(3,uorder.getId());		pstmt.setString(4,uorder.getPhone());		pstmt.setString(5,uorder.getPerson());		pstmt.setInt(6,uorder.getStatus());		pstmt.setString(7,uorder.getAddress());		pstmt.setString(8,uorder.getOdate());		pstmt.setString(9,uorder.getCode());		if(pstmt.executeUpdate()>0){
			this.close();
			return true;
		}else{
			this.close();
			return false;
		}
	}
	public Uorder findUorder(int id,Connection conn) throws Exception{
		String sql = "select * from uorder where id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,id);		rs = pstmt.executeQuery();
		Uorder uorder = new Uorder();
		if(rs.next()){
			uorder.setTotal(rs.getFloat("total"));
			uorder.setUid(rs.getInt("uid"));
			uorder.setId(rs.getInt("id"));
			uorder.setPhone(rs.getString("phone"));
			uorder.setPerson(rs.getString("person"));
			uorder.setStatus(rs.getInt("status"));
			uorder.setAddress(rs.getString("address"));
			uorder.setOdate(rs.getString("odate"));
			uorder.setCode(rs.getString("code"));
		}
		this.close();
		return uorder;
	}
	public List<Uorder> findUorders(Connection conn) throws Exception{
		String sql = "select * from uorder";
		pstmt = conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		List<Uorder> uorders = new ArrayList<Uorder>();
		while(rs.next()){
			Uorder uorder = new Uorder();
			uorder.setTotal(rs.getFloat("total"));
			uorder.setUid(rs.getInt("uid"));
			uorder.setId(rs.getInt("id"));
			uorder.setPhone(rs.getString("phone"));
			uorder.setPerson(rs.getString("person"));
			uorder.setStatus(rs.getInt("status"));
			uorder.setAddress(rs.getString("address"));
			uorder.setOdate(rs.getString("odate"));
			uorder.setCode(rs.getString("code"));
			uorders.add(uorder);
		}
		this.close();
		return uorders;
	}
	public void close() throws Exception{
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
	}
}