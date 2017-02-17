<%@ page language="java" import="java.util.*,com.orilore.entitys.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML>

<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>便便书城</title>
	<link rel="stylesheet" type="text/css" href="css/index.css" media="screen" title="no title" charset="utf-8">
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
					<li class="fl ul1-li1">欢迎光临便便，</li>
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
		<!-- =================第五部分==================== -->
		<div class="div6 cl">
			<div class="div6-l fl">
				<div class="div6-l-1">图书分类</div>
				<div class="div6-l-2">
					<div class="div6-l-2-t">教育</div>
					<div class="div6-l-2-b cl">
						<div class="div6-l-2-b-1 fl"><a href="" title="">教材</a></div>
						<div class="div6-l-2-b-2 fl"><a href="" title="">外语</a></div>
						<div class="div6-l-2-b-3 fl"><a href="" title="">考试</a></div>
						<div class="div6-l-2-b-4 fl"><a href="" title="">中小学教辅</a></div>
					</div>
				</div>
				<div class="div6-l-3">
					<div class="div6-l-3-t">电子书</div>
					<div class="div6-l-3-b"><a href="" title="">便便出品</a></div>
				</div>
				<div class="div6-l-4">
					<div class="div6-l-4-1">小说</div>
				</div>
				<div class="div6-l-5">
					<div class="div6-l-5-t">文艺</div>
					<div class="div6-l-5-b cl">
						<div class="div6-l-5-b-1 fl"><a href="" title="">文学</a></div>
						<div class="div6-l-5-b-2 fl"><a href="" title="">传记</a></div>
						<div class="div6-l-5-b-3 fl"><a href="" title="">艺术</a></div>
						<div class="div6-l-5-b-4 fl"><a href="" title="">摄影</a></div>
					</div>
				</div>
				<div class="div6-l-6">
					<div class="div6-l-6-t">青春</div>
					<div class="div6-l-6-b cl">
						<div class="div6-l-6-b-1 fl"><a href="" title="">青春文学</a></div>
						<div class="div6-l-6-b-2 fl"><a href="" title="">动漫</a></div>
						<div class="div6-l-6-b-3 fl "><a href="" title="">幽默</a></div>
					</div>
				</div>
				<div class="div6-l-7">
					<div class="div6-l-7-t">童书</div>
					<div class="div6-l-7-m cl">
						<div class="div6-l-7-m-1 fl"><a href="" title="">0-2</a></div>
						<div class="div6-l-7-m-2 fl"><a href="" title="">3-6</a></div>
						<div class="div6-l-7-m-3 fl"><a href="" title="">7-10</a></div>
						<div class="div6-l-7-m-4 fl"><a href="" title="">11-14</a></div>
					</div>
					<div class="div6-l-7-b cl">
						<div class="div6-l-7-b-1 fl"><a href="" title="">科普/百科</a></div>
						<div class="div6-l-7-b-2 fl"><a href="" title="">图画书</a></div>
						<div class="div6-l-7-b-3 fl"><a href="" title="">文学</a></div>
						<div class="div6-l-7-b-4 fl"><a href="" title="">英语</a></div>
					</div>
				</div>
				<div class="div6-l-8">
					<div class="div6-l-8-1">生活</div>
					<div class="div6-l-8-2 cl">
						<div class="div6-l-8-2-1 fl"><a href="" title="">孕期</a></div>
						<div class="div6-l-8-2-2 fl"><a href="" title="">两性</a></div>
						<div class="div6-l-8-2-3 fl"><a href="" title="">育儿/家教</a></div>
					</div>
					<div class="div6-l-8-3 cl">
						<div class="div6-l-8-3-1 fl"><a href="" title="">亲子/家教</a></div>
						<div class="div6-l-8-3-2 fl"><a href="" title="">保健</a></div>
						<div class="div6-l-8-3-3 fl"><a href="" title="">运动</a></div>
						<div class="div6-l-8-3-4 fl"><a href="" title="">美妆</a></div>
					</div>
					<div class="div6-l-8-4 cl">
						<div class="div6-l-8-4-1 fl"><a href="" title="">手工/DIY</a></div>
						<div class="div6-l-8-4-2 fl"><a href="" title="">美食</a></div>
						<div class="div6-l-8-4-3 fl"><a href="" title="">旅游</a></div>
						<div class="div6-l-8-4-4 fl"><a href="" title="">休闲</a></div>
					</div>
					<div class="div6-l-8-5 cl">
						<div class="div-6-l-8-5-1 fl"><a href="" title="">家庭/家居</a></div>
						<div class="div-6-l-8-5-2 fl"><a href="" title="">风水/占卜</a></div>
					</div>
				</div>
				<div class="div6-l-9">
					<div class="div6-l-9-1">人文社科</div>
					<div class="div6-l-9-2 cl">
						<div class="div6-l-9-2-1 fl"><a href="" title="">历史</a></div>
						<div class="div6-l-9-2-2 fl"><a href="" title="">古籍</a></div>
						<div class="div6-l-9-2-3 fl"><a href="" title="">哲学/宗教</a></div>
						<div class="div6-l-9-2-4 fl"><a href="" title="">文化</a></div>
					</div>
					<div class="div6-l-9-3 cl">
						<div class="div6-l-9-3-1 fl"><a href="" title="">政治/军事</a></div>
						<div class="div6-l-9-3-2 fl"><a href="" title="">法律</a></div>
						<div class="div6-l-9-3-3 fl"><a href="" title="">社会科学</a></div>
					</div>
					<div class="div6-l-9-4"><a href="" title="">心理学</a></div>
				</div>
				<div class="div6-l-10">
					<div class="div6-l-10-t">经管</div>
					<div class="div6-l-10-b cl">
						<div class="div6-l-10-b-1 fl"><a href="" title="">管理</a></div>
						<div class="div6-l-10-b-2 fl"><a href="" title="">投资理财</a></div>
						<div class="div6-l-10-b-3 fl"><a href="" title="">经济</a></div>
						<div class="div6-l-10-b-4 fl"><a href="" title="">音像</a></div>
					</div>
				</div>
				<div class="div6-l-11">
					<div class="div6-l-11-1">励志/成功</div>
				</div>
				<div class="div6-l-12">
					<div class="div6-l-12-t">科技</div>
					<div class="div6-l-12-m cl">
						<div class="div6-l-12-m-1 fl"><a href="">科普</a></div>
						<div class="div6-l-12-m-2 fl"><a href="">建筑</a></div>
						<div class="div6-l-12-m-3 fl"><a href="">医学</a></div>
						<div class="div6-l-12-m-4 fl"><a href="">计算机</a></div>
					</div>
					<div class="div6-l-12-b cl">
						<div class="div6-l-12-b-1 fl"><a href="">农林</a></div>
						<div class="div6-l-12-b-2 fl"><a href="">自然科学</a></div>
						<div class="div6-l-12-b-3 fl"><a href="">工业</a></div>
					</div>
				</div>
				<div class="div6-l-13">
					<div class="div6-l-13-1">工具书</div>
				</div>
				<div class="div6-l-14">
					<div class="div6-l-14-1">英文原版书 港台图书</div>
				</div>
				<div class="div6-l-15">
					<div class="div6-l-15-1">期刊</div>
				</div>
			</div>
			<div class="div6-m fl">
				<div class="div6-m-1">
					<a href="" title="">
						<img src="img/item-img-4.jpg" alt="">
					</a>
				</div>
				<div class="div6-m-2 cl">
					<div class="div6-m-2-1 fl">
						<img src="img/item-img-17.jpg" alt="">
					</div>
					<div class="div6-m-2-2 fl">
						书上市
					</div>
				</div>
				
				<div class="divdate cl">
				<%
					List<Product> ps = (List<Product>)request.getAttribute("products");
					for(int i=0;i<ps.size();i++){
					  Product p = ps.get(i);
					%>
						<div class="divdate-1 fl">
							<div class="">
								<a href="shangpin?id=<%=p.getId() %>">
									<img alt="" src="<%=p.getPicture() %>">
								</a>
							</div>
							<div class="bname">
								<a href="shangpin?id=<%=p.getId() %>">
									<%=p.getName() %>
								</a>
							</div>
							<div class="binfo">
								<%=p.getInfo() %>
							</div>
							<div class="bprice">
								￥<%=p.getPrice() %>
							</div>
							<div class="bdiscount">
								￥<%=p.getDiscount() %>
							</div>
					
						</div>
					
					<% 
					
					}
				%>
					
				
				</div>
				
				
				
			</div>
			<div class="div6-r fl">
				<div class="div6-r-1">
					<div class="div6-r-1-t">最新动态</div>
					<div class="div6-r-1-b">
						<ul class="div6-r-1-b-ul">
							<li class="div6-r-1-b-ul-li1"><a href="" title="">年终榜单，生活图书6折封顶</a></li>
							<li class="div6-r-1-b-ul-li2"><a href="" title="">10万图书5折封顶，社科分会场</a></li>
							<li class="div6-r-1-b-ul-li3"><a href="" title="">阅享频道：美国人重新发现的乾隆帝</a></li>
						</ul>
					</div>
					
				</div>
				<div class="div6-r-2">
					<div class="div6-r-2-1">新书预售</div>
					<div class="div6-r-2-2"><a href="" title="">预售更多</a></div>
					<div class="div6-r-2-3">
						<a href="" title="">
							<img src="img/item-img-33.jpg" alt="">
						</a>
					</div>
					<div class="div6-r-2-4">
						<a href="" title="">我的世界都是你（精装签名本）</a>
					</div>
					<div class="div6-r-2-5">￥52.50</div>
					<div class="div6-r-2-6">￥70.00</div>
				</div>
				<div class="div6-r-3 cl">
					<div class="div6-r-3-1 fl">
						<img src="img/item-img-16.png" alt="">
					</div>
					<div class="div6-r-3-2 fl">
						<a href="" title="">新书热卖榜</a>
					</div>
				</div>
				<div class="div6-r-4">
					<div class="div6-r-4-1">总榜</div>
					<div class="div6-r-4-2">
						<div class="div6-r-4-2-1">1</div>
						<div class="div6-r-4-2-2">
							<a href="" title="">
								<img src="img/item-img-14.jpg" alt="">
							</a>
						</div>
						<div class="div6-r-4-2-3">
							<a href="" title="">我喜欢这个功利的世界</a>
						</div>
						<div class="div6-r-4-2-4">￥21.20</div>
						<div class="div6-r-4-2-5">￥38.00</div>
					</div>
					<div class="div6-r-4-3">
						<div class="div6-r-4-3-1">2</div>
						<div class="div6-r-4-3-2"><a href="" title="">自在独行：贾平凹的独行世界</a></div>
					</div>
					<div class="div6-r-4-4">
						<div class="div6-r-4-4-1">3</div>
						<div class="div6-r-4-4-2"><a href="" title="">就喜欢你看不惯我，又干不掉我</a></div>
					</div>
					<div class="div6-r-4-5">
						<div class="div6-r-4-5-1">4</div>
						<div class="div6-r-4-5-2"><a href="" title="">月童渡河</a></div>
					</div>
					<div class="div6-r-4-6">
						<div class="div6-r-4-6-1">5</div>
						<div class="div6-r-4-6-2"><a href="" title="">在宇宙间不易被风吹散</a></div>
					</div>
					<div class="div6-r-4-7">
						<div class="div6-r-4-7-1">6</div>
						<div class="div6-r-4-7-2"><a href="" title="">悟空传</a></div>
					</div>
					<div class="div6-r-4-8">
						<div class="div6-r-4-8-1">7</div>
						<div class="div6-r-4-8-2"><a href="" title="">原来你还在这里</a></div>
					</div>
					<div class="div6-r-4-9">
						<div class="div6-r-4-9-1">8</div>
						<div class="div6-r-4-9-2"><a href="" title="">黑石之墓</a></div>
					</div>
					<div class="div6-r-4-10">
						<div class="div6-r-4-10-1">9</div>
						<div class="div6-r-4-10-2"><a href="" title="">答案之书（我的人生解答书）</a></div>
					</div>
					<div class="div6-r-4-11">
						<div class="div6-r-4-11-1">10</div>
						<div class="div6-r-4-11-2"><a href="" title="">别生气，我又不是在说你</a></div>
					</div>
					<div class="div6-r-4-12">
						<div class="div6-r-4-12-a"><a href="" title="">查看完整榜单→</a></div>
					</div>
				</div>
			</div>
		</div>
		<!-- =================第五部分完==================== -->
	</div>
	
</body>
</html>