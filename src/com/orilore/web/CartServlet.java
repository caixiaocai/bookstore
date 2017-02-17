package com.orilore.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.orilore.bizs.CartBiz;
import com.orilore.bizs.ICartBiz;
import com.orilore.bizs.IProductBiz;
import com.orilore.bizs.ProductBiz;
import com.orilore.entitys.Cart;
import com.orilore.entitys.Product;
import com.orilore.entitys.User;

public class CartServlet extends HttpServlet {
	private ICartBiz biz = new CartBiz();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = (User) request.getSession().getAttribute("user");
		if (user == null) {
			response.sendRedirect("login.jsp");
		} else {
		List<Cart> carts = biz.findCarts();
		request.setAttribute("carts", carts);
		RequestDispatcher rd = request.getRequestDispatcher("Cart.jsp");
		rd.forward(request, response);
	}
	}
}
