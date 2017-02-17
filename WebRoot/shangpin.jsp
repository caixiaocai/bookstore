<%@ page language="java" import="java.util.*,com.orilore.entitys.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>商品详细页</title>
	<link rel="stylesheet" type="text/css" href="css/shangpin.css" media="screen" title="no title" charset="utf-8">
	
</head>
<body>
<!-- ====================导航======================= -->
	<div class="body">
		<div class="div1 cl">
			<div class="div1-1 fl">送至：</div>
			<div class="div1-2 fl">
				<select>
					<option checked>北京</option>
					<option>天津</option>
					<option>河北</option>
					<option>山西</option>
					<option>内蒙古</option>
					<option>辽宁</option>
				</select>
			</div>
			<div class="div1-3 fl">
				<ul class="ul1 cl">
					<li class="fl ul1-li1">欢迎光临便便</li>
					<li class="fl ul1-li2">
						<%
						User user = (User)session.getAttribute("user");
						 if(user==null){%>
						<a href="login.jsp" title="" class="div1-a1">登录</a>
						<% 
						}else{%>
							${user.getName()}<span><a href="logout.jsp">[退出]</a></span>
						<%} %>
					</li>
					<li class="fl ul1-li3 cl">
						<a href="zhuce.jsp" title="">成为会员</a>
						
					</li>
					<li class="fl ul1-li4 cl">
						<a href="" title="">便便自出版</a>
						
					</li>
					<li class="fl ul1-li5 cl">
						<a href="" title="">
							<div class="div1-3-1 cl">
								<div class="div1-3-1-1 fl">
									<img src="img/item-img-31.jpg" alt="">
								</div>
								<div class="div1-3-1-2 fl">手机便便</div>
							</div>
						</a>
						
					</li>
					<li class="fl ul1-li6 cl">
						<select>
							<option>我的便便</option>
							<option>我的订单</option>
							<option>购物车</option>
							<option>我的余额</option>
							<option>我的评论</option>
						</select>
						
					</li>
					<li class="fl ul1-li7 cl">
						<a href="" title="">学校采购</a>
					</li>
					<li class="fl ul1-li8">
						<select>
							<option>客户服务</option>
							<option>帮助中心</option>
							<option>自动退换货</option>
							<option>联系客服</option>
							<option>我要投诉</option>
						</select>
						
					</li>
				</ul>
			</div>
		</div>
		<!-- ============导航完=================== -->
		<!-- ==============第1部分====================== -->
		<div class="div2 cl">
			<div class="div2-1 fl">
				<img src="img/item-img-32.jpg" alt="">
			</div>
			<div class="div2-2 fl">
				<div class="div2-2-top">
					<input type="text" class="div2-text">
					<a href="" title="">
						<input type="button" class="div2-but" value="搜索">
					</a>
				</div>
				<div class="div2-2-bto">
					<ul class="ul2 cl">
						<a href="">
							<li class="ul2-li1">热搜：</li>
						</a>
						<a href="">
							<li class="ul2-li2"> 旧时光</li>
						</a>
						<a href="">
							<li class="ul2-li3">硬派健身</li>
						</a>
						<a href="">
							<li class="ul2-li4">心静的力量</li>
						</a>
						<a href="">
							<li class="ul2-li5">罗尔德达尔</li>
						</a>
						<a href="">
							<li class="ul2-li6">余罪</li>
						</a>
					</ul>
				</div>
			</div>
			<div class="div2-3 fl cl">
				<div class="div2-3-1 fl cl">
					<div class="div2-3-1-1 fl">
						<a href="" title=""><img src="img/item-img-2.jpg" alt=""></a>
					</div>
					<div class="div2-3-1-2 fl"><a href="CartServlet" title="">购物车</a></div>
				</div>
				<div class="div2-3-2 fl">
					<a href="" title=""><div class="div2-3-2-1">我的订单</div></a>
					</div>
			</div>
		</div>
		<!-- ==============第1部分完====================== -->
		<!-- =============第二部分====================== -->
		<div class="div3 cl">
			<div class="div3-1 fl">
				<select class="div3-1-se">
					<option>全部商品分类</option>
					<option>小说</option>
					<option>管理</option>
					<option>文学</option>
					<option>成功励志</option>
					<option>青春文学</option>
					<option>历史</option>
				</select>
			</div>
			<div class="div3-2 fl"><a href="">尾品汇</a></div>
			<div class="div3-3 fl"><a href="">图书</a></div>
			<div class="div3-4 fl"><a href="">电子书</a></div>
			<div class="div3-5 fl"><a href="">原创文学</a></div>
			<div class="div3-6 fl"><a href="">创意文具</a></div>
		</div>
		<!-- ================第二部分完========================= -->
		<!-- ===========第三部分====================== -->
		<div class="div4 cl">
			<div class="div4-1 fl">图书排行榜</div>
			<div class="div4-2 fl">童书</div>
			<div class="div4-3 fl">教辅</div>
			<div class="div4-4 fl">小说</div>
			<div class="div4-5 fl">管理</div>
			<div class="div4-6 fl">文学</div>
			<div class="div4-7 fl">成功励志</div>
			<div class="div4-8 fl">青春文学</div>
			<div class="div4-9 fl">历史</div>
			<div class="div4-10 fl">哲学宗教</div>
			<div class="div4-11 fl">亲子家教</div>
			<div class="div4-12 fl">传记</div>
			<div class="div4-13 fl">保健养生</div>
			<div class="div4-14 fl">新书预售</div>
			<div class="div4-15 fl">图书尾品汇</div>
			<div class="div4-16 fl">电子书</div>
			<div class="div4-17 fl">便便原创</div>
		</div>
		<!-- ================第三部分完============================= -->
		<!-- ===============第四部分================== -->
		<div class="div5">
			<div class="div5-1">
				<a href="" title=""><img src="img/item-img-3.jpg" alt=""></a>
			</div>
		</div>
		<!-- =============第四部分完===================== -->
        
        <div class="shangpin">
        	
        	<div class="picture">
        		<img alt="" src="${sessionScope.product.picture }">		
			</div>
				<div class="name">${sessionScope.product.name }</div>
				<div class="info">作者：${sessionScope.product.info }</div>
				<div class="price">现价：￥${sessionScope.product.price }</div>
				<div class="discount">原价：￥${sessionScope.product.discount }</div>
				<a href="BuyServlet?id=${sessionScope.product.id }"><div class="sub">加入购物车</div></a>
				<a href="ShowProducts"><input type="submit" class="sub1" value="返回首页"></a>
		</div>
	
</body>
</html>











