# BookStore
BookStore是基于javaee的一个在线书店网站，
是集网上图书选购，在线图书支付，个人账户管理，图书介绍与推荐等多功能于一体的综合性系统。

#系统架构
我们的前端系统主要包括：

* 支付系统
* 用户管理
* 购物车
* 订单系统
* 个人中心
* 图书展示系统 

![系统架构](resource/功能.png)

这6大主要系统，通过这6大系统之间的协调合作，实现整个在线书店项目的全部功能。

###代码结构
后台代码设计主体为4个包，包括:

* Com.orilore.entitys:为数据库内所有的实体类及get和set方法。
* Com.orilore.daos：包含了数据库连接的DBUtil类，及各个实体类的增删改查方法。
* Com.orilore.bizs：包含了dao包内所有方法的调用方法，以及实现这些方法的所有接口类。
* Com.orilore.web：连接了业务层与外部层，实现了JSP页面的所有按钮的跳转与判断语句，动态实现了JSP页面的功能。

###开发工具
eclipse，myeclipse，mysql

#效果

###主页
![主页](resource/主页.png)

###支付系统
![支付系统](resource/支付.png)

###个人中心
![个人中心](resource/个人中心.png)

###购物车
![购物车](resource/购物车.png)

###图书展示
![图书展示](resource/图书展示.png)

###用户管理
![用户管理](resource/用户管理.png)

#如何贡献代码
欢迎贡献代码:-)