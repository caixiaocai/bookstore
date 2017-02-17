<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML>
<html>
  <head>
    <title>充值页面</title>
    <style type="text/css">
    .box{
    	width:676px;height:449px;
    	margin:10px auto;
  		position: relative;	
    }
    .text{
    	position: absolute;
    	top:128px;
    	left:414px;
    	width:130px;
    	height:35px;
    	
    	color:#050400;
    	font-size: 18px;
    	border:1px solid #a87f52;
    }
    .sub{
    	position: absolute;
    	top:184px;
    	left:469px;
    	width:75px;
    	height:30px;
    	background: #98582a;
    	color:#ffffff;
    	font-size: 18px;
    	font-weight: bold;
    	font-family: "楷体";
    	border:1px solid #98582a;
    }
    
    </style>
    
  </head>
  
  <body>
   		<div class="box">
   			<div class="tupian">
   				<img alt="" src="img/img-09.jpg" >
   			</div>
   			
   			<form action="AddmonServlet">
   				<div>
   					<input type="text" class="text" name="text">
   				</div>
   				<div>
   					<input type="submit" value="充值"  class="sub">
   				</div>
   			</form>
			  		
   		</div>
  </body>
</html>
