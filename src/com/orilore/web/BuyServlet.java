package com.orilore.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.enterprise.context.SessionScoped;
import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.orilore.bizs.CartBiz;
import com.orilore.bizs.ICartBiz;
import com.orilore.bizs.IProductBiz;
import com.orilore.bizs.IUserBiz;
import com.orilore.bizs.ProductBiz;
import com.orilore.bizs.UserBiz;
import com.orilore.daos.DBUtil;
import com.orilore.entitys.Cart;
import com.orilore.entitys.Product;
import com.orilore.entitys.User;

public class BuyServlet extends HttpServlet {
	private ICartBiz biz = null;
    private DBUtil db= new DBUtil();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		biz = new CartBiz();
		User user = (User) request.getSession().getAttribute("user");
		if (user == null) {
			response.sendRedirect("login.jsp");
		} else {
			String uname = user.getName();
			String id = request.getParameter("id");
			System.out.println(id);
			int pid = Integer.parseInt(id);
			IProductBiz biz1 = new ProductBiz();
			Product p = biz1.findProduct(pid);
			Cart cart = new Cart();
			cart.setBookname(p.getName());
			cart.setDiscount(p.getDiscount());
			cart.setPrice(p.getPrice());
			cart.setUsername(uname);
			Connection conn = db.getConnection();
			biz.addCart(cart);
			response.sendRedirect("ShowProducts");
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
