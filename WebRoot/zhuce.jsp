<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="css/zhuce.css" media="screen" title="no title" charset="UTF-8">
	<script type="text/javascript">
		function check(){
			if(form1.password.value!=form1.cpassword.value){
				alert("密码输入不一致！");
				return false;
			}
			if(form1.name.value==""){
				alert("昵称不能为空！");
				form1.name.focus();
				return false;
			}
			if(form1.phone.value==""){
				alert("手机号不能为空！");
				form1.phone.focus();
				return false;
			}
			if(form1.phone.value.length!=11){
				alert("手机号输入错误！请重新输入！");
				form1.phone.focus();
				return false;
			}
			if(form1.address.value==""){
				alert("地址不能为空！");
				form1.address.focus();
				return false;
			}
		}
	
	</script>
</head>
<body>
	<div class="div">
		<div class="div1">
			<div class="div1-1"></div>
			<div class="div1-2">注册帐号</div>
		</div>
		<form  id="form1" action="RegistServlet" method="post" onsubmit="return check();">
		<div class="div2 cl">
			<div class="div2-1 fl">昵称</div>
			<input type="text" name="name"  class="text1 fl" checked>
			<div class="div2-2 fl">请输入昵称</div>
		</div>
		<div class="div3 cl">
			<div class="div3-1 fl">密码</div>
			<div class="div3-2 fl">
				<input type="password" name="password" class="pwd1">
			</div>
		</div>
		<div class="div4 cl">
			<div class="div4-1 fl">确认密码</div>
			<div class="div4-2 fl">
				<input type="password" name="cpassword" class="pwd2">
			</div>
		</div>

		
		<div class="div8 cl">
			<div class="div8-1 fl">手机号码</div>
			<div class="div8-2 fl">
				<input type="text" class="text2" name="phone">
			</div>
		</div>
		
		<div class="div8 cl">
			<div class="div8-1 fl">收货地址</div>
			<div class="div8-2 fl">
				<input type="text" class="text2" name="address">
			</div>
		</div>
		<div class="div11">
			<input type="submit" value="立即注册" class="but">
		</div>
		</form>
	</div>
	
</body>
</html>