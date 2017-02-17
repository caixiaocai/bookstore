package com.orilore.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.orilore.bizs.IProductBiz;
import com.orilore.bizs.ProductBiz;
import com.orilore.entitys.Product;

public class shangpin extends HttpServlet {
	private IProductBiz biz = new ProductBiz();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
					String id = request.getParameter("id");
					int pid = Integer.parseInt(id);
					Product p = biz.findProduct(pid);
					HttpSession session = request.getSession();
                    session.setAttribute("product", p);				
					
					
					RequestDispatcher rd = request.getRequestDispatcher("/shangpin.jsp");
					rd.forward(request, response);
	}

}
