package com.orilore.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.orilore.bizs.CartBiz;
import com.orilore.bizs.ICartBiz;
import com.orilore.daos.DBUtil;

public class DelServlet extends HttpServlet {
	private ICartBiz biz = null;
    private DBUtil db= new DBUtil();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			biz = new CartBiz();
			String id = request.getParameter("cid");
			int id1 = Integer.parseInt(id);
			biz.delCart(id1);
			response.sendRedirect("CartServlet");
		
	}

}
