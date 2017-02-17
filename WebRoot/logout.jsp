<%@ page pageEncoding="UTF-8"%>
<% 
	session.invalidate();
	response.sendRedirect("ShowProducts");
%>