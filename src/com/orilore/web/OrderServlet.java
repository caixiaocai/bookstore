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
import com.orilore.entitys.Cart;
import com.orilore.entitys.Uorder;
import com.orilore.entitys.User;

public class OrderServlet extends HttpServlet {
	
	private IUorderBiz biz = new UorderBiz();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			response.sendRedirect("login.jsp");
		}else{
		List<Uorder> order = biz.findUorders();
		request.setAttribute("order", order);
		RequestDispatcher rd = request.getRequestDispatcher("order.jsp");
		rd.forward(request, response);
	}
	}
}
