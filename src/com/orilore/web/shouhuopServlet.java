package com.orilore.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.orilore.bizs.DetailBiz;
import com.orilore.bizs.IDetailBiz;
import com.orilore.entitys.Detail;

public class shouhuopServlet extends HttpServlet {

	private IDetailBiz biz = new DetailBiz();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String id1 = request.getParameter("id");
			int id2 = Integer.parseInt(id1);
			Detail det = biz.findDetail(id2);
			det.setQuantity(1);
			System.out.println(det.getQuantity());
			biz.updDetail(det);
			response.sendRedirect("MyselfServlet");
	}

}
