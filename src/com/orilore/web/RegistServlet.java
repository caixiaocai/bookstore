package com.orilore.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.orilore.bizs.IUserBiz;
import com.orilore.bizs.UserBiz;
import com.orilore.entitys.User;

public class RegistServlet extends HttpServlet {
	private IUserBiz biz = new UserBiz();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		
		User user = new User();
		user.setAddress(address);
		user.setName(name);
		user.setPassword(password);
		user.setPhone(phone);
		
		if(biz.addUser(user)){
			response.sendRedirect("login.jsp");
		}else{
			response.sendRedirect("zhuce.jsp");
		}
	}
}
