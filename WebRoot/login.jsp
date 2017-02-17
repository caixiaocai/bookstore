<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" type="text/css" href="css/denglu.css" media="screen" title="no title" charset="UTF-8">
	<script type="text/javascript">
		function check(){
			if(form1.name.value==""){
				alert("用户名不能为空！");
				form1.name.focus();
				return false;
			}
			if(form1.password.value==""){
				alert("密码不能为空！");
				form1.password.focus();
				return false;
			}
		}
	</script>
</head>
<body>
	<div class="div">
		<div class="div-1">
			<img src="img/item-img-32.jpg" alt="">
		</div>
		<div class="div-2">
			<div class="div-2-1">
				<img src="img/dl-img-1.png" alt="">
			</div>
			<div class="div-2-2">
				<div class="div-2-2-1">
					账户登录
				</div>
				<form name="form1" action="LoginServlet" method="post">
				<div class="div-2-2-2 cl">
					<div class="div-2-2-2-1 fl">
						<img src="img/dl-img-2.jpg" alt="">
					</div>
					<div class="div-2-2-2-2 fl">
						<input type="text" class="div2-text" value="用户名" name="name">
					</div>
				</div>
				<div class="div-2-2-3 cl">
					 <div class="div-2-2-3-1 fl">
						<img src="img/dl-img-3.jpg" alt="">
					</div>
					<div class="div-2-2-3-2 fl">
						<input type="password" class="div2-pwd" name="password" >
					</div>

				</div>
				<div class="div-2-2-4">
					<input type="submit" class="div2-but" value="登录">
				</div>
				<% 
					String msg = request.getParameter("msg");
					if(msg!=null && msg.equals("error")){
					 	out.print("<div class='er'>用户名或密码有误，请重新输入！</div>");
					}
				
				%>
				</form>
			</div>
		</div>
	</div>
	
</body>
</html>
