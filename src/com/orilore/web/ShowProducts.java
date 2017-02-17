package com.orilore.web;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.orilore.bizs.IProductBiz;
import com.orilore.bizs.ProductBiz;
import com.orilore.entitys.Product;

public class ShowProducts extends HttpServlet {
	private IProductBiz biz = new ProductBiz();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Product> products = biz.findProducts();
		request.setAttribute("products", products);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}
}
