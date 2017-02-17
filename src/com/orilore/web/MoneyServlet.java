package com.orilore.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.orilore.bizs.CartBiz;
import com.orilore.bizs.DetailBiz;
import com.orilore.bizs.IDetailBiz;
import com.orilore.bizs.IUorderBiz;
import com.orilore.bizs.IUserBiz;
import com.orilore.bizs.UorderBiz;
import com.orilore.bizs.UserBiz;
import com.orilore.entitys.Cart;
import com.orilore.entitys.Detail;
import com.orilore.entitys.Uorder;
import com.orilore.entitys.User;

public class MoneyServlet extends HttpServlet {
	private IUserBiz biz = new UserBiz();
	private IUorderBiz biz1= new UorderBiz();
	private IDetailBiz biz2 = new DetailBiz();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = (User) request.getSession().getAttribute("user");
		
		String mon = request.getParameter("status");
		float mon1 = Float.parseFloat(mon);
		float mon2 = user.getMoney();
		if(mon1>mon2){
			response.sendRedirect("addmoney.jsp");
		}else{
			List<Uorder> order = biz1.findUorders();
			request.setAttribute("order",order);
			List<Uorder> order1 = (List<Uorder>)request.getAttribute("order");
			for(int i=0;i<order1.size();i++){
				Uorder o = order1.get(i);
				Detail det = new Detail();
				String uname1 = user.getName();
				String uname2 = o.getPerson();
				if(uname2.equals(uname1)){
					det.setCode(o.getCode());
					String id = Integer.toString(o.getId());
					det.setSize(id);
					det.setAddress(o.getAddress());
					det.setPhone(o.getPhone());
					det.setMoney(o.getTotal());
					det.setName(uname1);
					biz2.addDetail(det);
					biz1.delUorder(o.getId());
				}
			}
			mon2 = mon2 - mon1;
			user.setMoney(mon2);
			biz.updUser(user);
			
			response.sendRedirect("zhifu.jsp");
			
		}
	}

}
