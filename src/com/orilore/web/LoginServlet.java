package com.orilore.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.orilore.bizs.IUserBiz;
import com.orilore.bizs.UserBiz;
import com.orilore.entitys.User;

public class LoginServlet extends HttpServlet {
	private IUserBiz biz = new UserBiz();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		User user = biz.login(name, password);
		if(user==null){
			response.sendRedirect("login.jsp?msg=error");
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("user",user);
			response.sendRedirect("ShowProducts");
		}
	}
}
