package com.orilore.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.orilore.bizs.CartBiz;
import com.orilore.bizs.ICartBiz;
import com.orilore.bizs.IUorderBiz;
import com.orilore.bizs.UorderBiz;
import com.orilore.daos.DBUtil;
import com.orilore.entitys.Cart;
import com.orilore.entitys.Uorder;
import com.orilore.entitys.User;

public class UorderServlet extends HttpServlet {
	private ICartBiz biz = null;
    private DBUtil db= new DBUtil();
    private IUorderBiz biz1= null;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		biz1=new UorderBiz();
		biz = new CartBiz();
		User user = (User) request.getSession().getAttribute("user");
		List<Cart> carts = biz.findCarts();
		request.setAttribute("carts",carts);
		List<Cart> os = (List<Cart>)request.getAttribute("carts");
		for(int i=0; i<os.size();i++){
			Cart o = os.get(i);
			String uname1 = o.getUsername();
			String uname2 = user.getName();
			if(uname1.equals(uname2)){
				Uorder order = new Uorder();
				order.setAddress(user.getAddress());
				order.setPerson(user.getName());
				order.setPhone(user.getPhone());
				order.setCode(o.getBookname());
				order.setUid(user.getId());
				order.setTotal(o.getPrice());
				String zong = request.getParameter("status");
				float status = Float.parseFloat(zong);
				order.setStatus(status);
				biz1.addUorder(order);
				biz.delCart(o.getId());
				
			}else{
				continue;
			}
		}
		response.sendRedirect("OrderServlet");
	 

	
	}

}
