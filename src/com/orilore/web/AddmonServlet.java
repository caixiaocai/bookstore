package com.orilore.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.orilore.bizs.IUserBiz;
import com.orilore.bizs.UserBiz;
import com.orilore.entitys.User;

public class AddmonServlet extends HttpServlet {

	private IUserBiz biz = new UserBiz();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = (User) request.getSession().getAttribute("user");
		String mon = request.getParameter("text");
		float mon1 = Float.parseFloat(mon);
		float mon2 = user.getMoney();
		mon2 = mon1 + mon2;
		user.setMoney(mon2);
		biz.updUser(user);
		response.sendRedirect("ShowProducts");
		
	}

}
