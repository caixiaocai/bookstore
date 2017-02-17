package com.orilore.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.orilore.bizs.DetailBiz;
import com.orilore.bizs.IDetailBiz;
import com.orilore.entitys.Detail;
import com.orilore.entitys.Product;
import com.orilore.entitys.User;

public class MyselfServlet extends HttpServlet {

	private IDetailBiz biz = new DetailBiz();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = (User) request.getSession().getAttribute("user");
		if (user == null) {
			response.sendRedirect("login.jsp");
		} else {
		List<Detail> details = biz.findDetails();
		request.setAttribute("details", details);
		RequestDispatcher rd = request.getRequestDispatcher("Myself.jsp");
		rd.forward(request, response);
		
	}
	}
}
