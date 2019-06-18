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
	
	<!-- 柱状图绘制 -->
	<script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/echarts.min.js"></script>
       <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts-gl/echarts-gl.min.js"></script>
       <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts-stat/ecStat.min.js"></script>
       <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/extension/dataTool.min.js"></script>
       <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/china.js"></script>
       <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/world.js"></script>
       <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=ZUONbpqGBsYGXNIYHicvbAbM"></script>
       <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/extension/bmap.min.js"></script>
       <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/simplex.js"></script>
	
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
					
										
										


					<li class="active open">
						<a href="${pageContext.request.contextPath}/index" >
							<i class="menu-icon fa fa-pencil-square-o"></i>
							<span class="menu-text"> 售票数量 </span>

							
						</a>
								<b class="arrow"></b>
							</li>
						
					

					<li class="">
						<a href="${pageContext.request.contextPath}/amountofdifferentkind">
							<i class="menu-icon fa fa-list-alt"></i>
							<span class="menu-text"> 各类票的销售量 </span>
						</a>

						<b class="arrow"></b>
					</li>


					<li class="">
						<a href="${pageContext.request.contextPath}/money">
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
				<div class="page-content">

					<!-- /section:settings.box -->
					<div class="page-content-area">

						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
								<div class="row">
									<div class="col-xs-12">
										<div class="table-header">
												输入票的信息
										</div>
									</div>
									</br>
									<div class="col-xs-4">
										选择年份:
										<select id="year" name="year">     
										  <option value="0">-请选择-</option>     
										  <option value="2015">2015</option>     
										  <option value="2016">2016</option> 
										  <option value="2017">2017</option> 
										  <option value="2018">2018</option> 
										 </select>
										 图表:
										<select id="chart" name="chart">     
										  <option value="0">-请选择-</option>     
										  <option value="bar">柱状图</option>     
										  <option value="line">折线图</option> 
										 </select>  
										<button type="button" onclick="sellTicketsStatistics()" class="width-10 pull-right btn btn-sm btn-primary"><i class="ace-icon fa fa-key"></i><span class="bigger-110">查询</span></button>
									</div>
									<!-- /.span -->
								</div>
								<!-- /.row -->
								<div id="container" style="height: 500px"></div>
								</div><!-- /.page-content-area -->
				</div><!-- /.page-content -->
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
	
	<script type="text/javascript">
	
	//获取票务信息
	function sellTicketsStatistics(){
		var year = $("#year").val();
		var chartType = $("#chart").val();
		$.ajax({
			url:"${pageContext.request.contextPath}/sellTicketsStatistics",
			data:"year="+year,
			type:"GET",
			success:function(result){	
				var dom = document.getElementById("container");
				var myChart = echarts.init(dom);
				var app = {};
				option = null;
				if (chartType == "bar") {
					option = {
					    tooltip: {
					        trigger: 'axis',
					        axisPointer: {
					            type: 'cross',
					            crossStyle: {
					                color: '#999'
					            }
					        }
					    },
					    toolbox: {
					        feature: {
					            dataView: {show: true, readOnly: false},
					            saveAsImage: {show: true}
					        }
					    },
					    xAxis: [
					        {
					            type: 'category',
					            data: ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月'],
					            axisPointer: {
					                type: 'shadow'
					            }
					        }
					    ],
					    yAxis: [
					        {
					            type: 'value',
					            name: '售票数量',
					            min: 0,
					            max: 20,
					            interval: 1,
					            axisLabel: {
					                formatter: '{value}'
					            }
					        },
					    ],
					    series: [
					        {
					            name:'售票数量',
					            type:'bar',
					            data:result,
					        },
					    ]
					};
					;
					if (option && typeof option === "object") {
					    myChart.setOption(option, true);
					}
				}else if (chartType == "line"){
					option = {
							toolbox: {
						        feature: {
						            dataView: {show: true, readOnly: false},
						            saveAsImage: {show: true}
						        }
						    },
						    xAxis: {
						        type: 'category',
						        data: ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']
						    },
						    yAxis: {
						        type: 'value'
						    },
						    series: [{
						    	name:'售票数量',
						        data: result,
						        type: 'line'
						    }]
						};
						;
						if (option && typeof option === "object") {
						    myChart.setOption(option, true);
						}
				}
			}
		})
	}
	</script>
	
	
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