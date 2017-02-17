<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML>
<html>
  <head>
    <title>支付成功</title>
    <style type="text/css">
    .box{
    	width:676px;
    	height:449px;
    	position: relative;
    	margin:20px auto;
    }
    .text{
    	position: absolute;
    	top:144px;
    	left:268px;
    	width:258px;
    	color:#ac002d;
    	font-family: "楷体";
    	font-size: 16px;
    	font-weight:bold;
    }
    
    .bu1{
    	position: absolute;
    	top:223px;
    	left:332px;
    	width:80px;
    	height:28px;
    	color:#ffffff;
    	font-family: "楷体";
    	font-size: 16px;
    	font-weight:bold; 
    }
    .bu2{
    	width:80px;
    	height:28px;
    	color:#ffffff;
    	font-family: "楷体";
    	font-size: 16px;
    	font-weight:bold; 
    	position: absolute;
    	top:223px;
    	left:450px;
    }
    a{
    	text-decoration: none;
    }
   
    </style>
    
  </head>
  
  <body>
    <div class="box">
    	<div class="img">
    		<img alt="" src="img/img-09.jpg">
    	</div>
    	 <div class="text">恭喜您支付成功，您的书会尽快送达</div>
    	<div class="bu1"><a href="ShowProducts">返回首页</a></div>
    	<div class="bu2"><a href="MyselfServlet">个人中心</a></div>
    
  </body>
    </div>
   
</html>
