<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<meta charset="utf-8" />
	<title>公园售票系统</title>
	<meta name="description" content="Restyling jQuery UI Widgets and Elements" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace-fonts.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace.min.css" id="main-ace-style" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	
	 
	
	<!--[if lte IE 9]>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace-part2.min.css" />
	<![endif]-->
	<!--[if lte IE 9]>
	  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace-ie.min.css" />
	<![endif]-->
	<script src="${pageContext.request.contextPath}/js/ace-extra.min.js"></script>
	<!--[if lte IE 8]>
	<script src="${pageContext.request.contextPath}/js/html5shiv.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/respond.min.js"></script>
	<![endif]-->
	<style type="text/css">
		.CSSearchTbl{ border:1px #008CD4 solid;}
		.CSSearchTbl thead{}
		.CSSearchTbl thead tr{}
		.CSSearchTbl thead tr th{  text-align:left; padding-left:10px;}
		.CSSearchTbl tbody{}
		.CSSearchTbl tbody tr{}
		.CSSearchTbl tbody tr td{  padding: 10px;}
		.CSSearchTbl tbody tr td.right{ text-align: left;}
		.CSSearchTbl tbody tr td.left{ text-align: right;}
		.table-responsive{ display: none;}
	</style>
</head>
<body class="no-skin">
	<!-- #section:basics/navbar.layout -->
		<div id="navbar" class="navbar navbar-default">

			<div class="navbar-container" id="navbar-container">
				<button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler">
					<span class="icon-bar"></span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>
				</button>

				<div class="navbar-header pull-left">
					<!-- #section:basics/navbar.layout.brand -->
					<a href="index.html" class="navbar-brand">
						<small>
							<img src="${pageContext.request.contextPath}/avatars/logo.png" alt="" />
						</small>
					</a>
				</div>

				<!-- #section:basics/navbar.dropdown -->
				<div class="navbar-buttons navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">

						
						<!-- #section:basics/navbar.user_menu -->
						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="${pageContext.request.contextPath}/avatars/user.jpg" alt="Jason's Photo" />
								<span class="user-info">
									欢迎您<br />
									<div id="user-name"><%= session.getAttribute("user_name")%></div>
								</span>

								<i class="ace-icon fa fa-caret-down"></i>
							</a>

							<ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								<li>
									<a href="#">
										<i class="ace-icon fa fa-cog"></i>
										系统设置
									</a>
								</li>

								<li>
									<a href="profile.html">
										<i class="ace-icon fa fa-user"></i>
										个人信息设置
									</a>
								</li>

								<li class="divider"></li>

								<li>
									<a href="${pageContext.request.contextPath}/login">
										<i class="ace-icon fa fa-power-off"></i>
										登出
									</a>
								</li>
							</ul>
						</li>

						<!-- /section:basics/navbar.user_menu -->
					</ul>
				</div>

				<!-- /section:basics/navbar.dropdown -->
			</div><!-- /.navbar-container -->
		</div>

		<!-- /section:basics/navbar.layout -->
		<div class="main-container" id="main-container">

			<div id="sidebar" class="sidebar responsive">
				<ul class="nav nav-list">
					<li class="active">
						<a href="${pageContext.request.contextPath}/adminindex">
							<i class="menu-icon fa fa-tachometer"></i>
							<span class="menu-text"> 首页 </span>
						</a>

						<b class="arrow"></b>
					</li>

					<li class="">
						<a href="${pageContext.request.contextPath}/adminshoupiao" >
							<i class="menu-icon fa fa-desktop"></i>
							<span class="menu-text">售票界面 </span>

							
						</a>

						
										
										


					<li class="active open">
						<a href="${pageContext.request.contextPath}/admincount" >
							<i class="menu-icon fa fa-pencil-square-o"></i>
							<span class="menu-text"> 售票数量 </span>

							
						</a>
								<b class="arrow"></b>
							</li>
						
					

					<li class="">
						<a href="${pageContext.request.contextPath}/admindifferent">
							<i class="menu-icon fa fa-list-alt"></i>
							<span class="menu-text"> 各类票的销售量 </span>
						</a>

						<b class="arrow"></b>
					</li>


					<li class="">
						<a href="${pageContext.request.contextPath}/adminmoney">
							<i class="menu-icon fa fa-picture-o"></i>
							<span class="menu-text">现金收入 </span>
						</a>

						<b class="arrow"></b>
					</li>

					

			</div>

			<!-- /section:basics/sidebar -->
			<div class="main-content">
				<div class="breadcrumbs" id="breadcrumbs">
					<ul class="breadcrumb">
						<li>
							<i class="ace-icon fa fa-home home-icon"></i>
							
						</li>
						
					</ul><!-- /.breadcrumb -->

					<!-- #section:basics/content.searchbox -->
					<div class="nav-search" id="nav-search">
						<form class="form-search">
							<span class="input-icon">
								<input type="text" placeholder="请输入关键字 ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
								<i class="ace-icon fa fa-search nav-search-icon"></i>
							</span>
						</form>
					</div><!-- /.nav-search -->
				</div>
				
								</div><!-- /.main-content -->
			
			<div class="footer">
				<div class="footer-inner">
					<!-- #section:basics/footer -->
					<div class="footer-content">
						
					</div>

					<!-- /section:basics/footer -->
				</div>
			</div>

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->
	
	
	
	<!--[if !IE]> -->
			<script type="text/javascript">
				window.jQuery || document.write("<script src='${pageContext.request.contextPath}/js/jquery.min.js'>"+"<"+"/script>");
			</script>
		<!-- <![endif]-->
		<!--[if IE]>
			<script type="text/javascript">
			 window.jQuery || document.write("<script src='js/jquery1x.min.js'>"+"<"+"/script>");
			</script>
		<![endif]-->
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='${pageContext.request.contextPath}/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
		<!--[if lte IE 8]>
		  <script src="${pageContext.request.contextPath}/js/excanvas.min.js"></script>
		<![endif]-->
		<script src="${pageContext.request.contextPath}/js/jquery-ui.custom.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/jquery.ui.touch-punch.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/ace.min.js"></script>
	
</body>
</html>