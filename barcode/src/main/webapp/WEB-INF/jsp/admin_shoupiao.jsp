<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<title>公园售票系统</title>
<meta name="description"
	content="Restyling jQuery UI Widgets and Elements" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/select2.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/font-awesome.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/ace-fonts.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/ace.min.css"
	id="main-ace-style" />
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
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/JsBarcode.all.min.js"></script>
<script type="text/javascript">
	var temp = "";
	function changeTickeType() {
		var myselect = document.getElementById('tickeType');
		var index = myselect.selectedIndex;
		var tickeType = myselect.options[index].value;
		if (tickeType == "标准票") {
			temp = "<div class='form-group'><div class='col-xs-12 col-sm-9'><div class='clearfix'><input type='button' class='btn' value='确认购买' onclick='standardTicket()'>";
			document.getElementById('content').innerHTML = temp;
			document.getElementById("content").style.display = "block";
		} else if (tickeType == "儿童票") {
			temp = "<div class='form-group'><div class='col-xs-12 col-sm-9'><div class='clearfix'><input type='button' class='btn' value='确认购买' onclick='childTicket()'>";
			document.getElementById('content').innerHTML = temp;
			document.getElementById("content").style.display = "block";
		} else if (tickeType == "学生票") {
			temp = "<div class='form-group'><label class='control-label col-xs-12 col-sm-3 no-padding-right' >购票人所在学校：</label>"
					+ "<div class='col-xs-12 col-sm-9'><div class='clearfix'><input type='text' name='school' id='school' class='col-xs-12 col-sm-6' />"
					+ "</div></div></div><div class='space-2'></div><div class='form-group'><div class='col-xs-12 col-sm-9'><div class='clearfix'><input type='button' class='btn' value='确认购买' onclick='studentTicket()'></div></div></div><div class='space-2'></div>";
			document.getElementById('content').innerHTML = temp;
			document.getElementById("content").style.display = "block";
		} else if (tickeType == "优惠票") {
			temp = "<div class='form-group'><label class='control-label col-xs-12 col-sm-3 no-padding-right' >优惠原因：</label>"
					+ "<div class='col-xs-12 col-sm-9'><div class='clearfix'>"
					+ "<input type='text' name='cause' id='cause' class='col-xs-12 col-sm-6' />"
					+ "</div></div></div><div class='space-2'></div>"
					+ "<div class='form-group'><label class='control-label col-xs-12 col-sm-3 no-padding-right' >优惠类型：</label>"
					+ "<div class='col-xs-12 col-sm-9'><div class='clearfix'>"
					+ "<input type='text' name='type' id='type' class='col-xs-12 col-sm-6' />"
					+ "</div></div></div><div class='space-2'></div>"
					+ "<div class='form-group'><div class='col-xs-12 col-sm-9'><div class='clearfix'><input type='button' class='btn' value='确认购买' onclick='discountTicket()'></div></div></div><div class='space-2'></div>";
			document.getElementById('content').innerHTML = temp;
			document.getElementById("content").style.display = "block";
		} else if (tickeType == "车辆进出票") {
			temp = "<div class='form-group'><label class='control-label col-xs-12 col-sm-3 no-padding-right' >车牌号：</label>"
					+ "<div class='col-xs-12 col-sm-9'><div class='clearfix'>"
					+ "<input type='text' name='carCode' id='carCode' class='col-xs-12 col-sm-6' />"
					+ "</div></div></div><div class='space-2'></div>"
					+ "<div class='form-group'><div class='col-xs-12 col-sm-9'><div class='clearfix'><input type='button' class='btn' value='确认购买' onclick='carTicket()'></div></div></div><div class='space-2'></div>";
			document.getElementById('content').innerHTML = temp;
			document.getElementById("content").style.display = "block";
		}
	}
	function changeTickeType2() {
		var myselect = document.getElementById('tickeType2');
		var index = myselect.selectedIndex;
		var tickeType = myselect.options[index].value;
		console.log(tickeType);
		if (tickeType == "touristTicket") {
			temp = "<div class='form-group'><label class='control-label col-xs-12 col-sm-3 no-padding-right' >旅行社名称：</label>"
					+ "<div class='col-xs-12 col-sm-9'><div class='clearfix'>"
					+ "<input type='text' name='touristName' id='touristName' class='col-xs-12 col-sm-6' />"
					+ "</div></div></div><div class='space-2'></div>"
					+ "<div class='form-group'><label class='control-label col-xs-12 col-sm-3 no-padding-right' >导游名称：</label>"
					+ "<div class='col-xs-12 col-sm-9'><div class='clearfix'>"
					+ "<input type='text' name='guideName' id='guideName' class='col-xs-12 col-sm-6' />"
					+ "</div></div></div><div class='space-2'></div>"
					+ "<div class='form-group'><div class='col-xs-12 col-sm-9'><div class='clearfix'><input type='button' class='btn' value='确认购买' onclick='touristTicket()'></div></div></div><div class='space-2'></div>";
			document.getElementById('content2').innerHTML = temp;
			document.getElementById("content2").style.display = "block";
		} else {
			temp = "<div class='form-group'><label class='control-label col-xs-12 col-sm-3 no-padding-right' >赠票授权人：</label>"
					+ "<div class='col-xs-12 col-sm-9'><div class='clearfix'>"
					+ "<input type='text' name='complimentaryAuthorizer' id='complimentaryAuthorizer' class='col-xs-12 col-sm-6' />"
					+ "</div></div></div><div class='space-2'></div>"
					+ "<div class='form-group'><label class='control-label col-xs-12 col-sm-3 no-padding-right' >赠票对象：</label>"
					+ "<div class='col-xs-12 col-sm-9'><div class='clearfix'>"
					+ "<input type='text' name='complimentaryPerson' id='complimentaryPerson' class='col-xs-12 col-sm-6' />"
					+ "</div></div></div><div class='space-2'></div>"
					+ "<div class='form-group'><div class='col-xs-12 col-sm-9'><div class='clearfix'><input type='button' class='btn' value='确认购买' onclick='complimentaryTicket()'></div></div></div><div class='space-2'></div>";
			document.getElementById('content2').innerHTML = temp;
			document.getElementById("content2").style.display = "block";
		}
	}
</script>
<script>
	function show(barcode) {
		JsBarcode('#barcode', barcode, {
			format : 'MSI',
			lineColor : '#000',
			width : 1,
			height : 50,
			displayValue : false
		})
	}
	function showAll(barcode, i) {
		JsBarcode('#barcode' + i, barcode, {
			format : 'MSI',
			lineColor : '#000',
			width : 1,
			height : 50,
			displayValue : false
		})
	}
</script>
<script type="text/javascript">
	function standardTicket() {
		var userName = document.getElementById('userName').value;
		var operator_id = document.getElementById('operator_id').value;
		$.ajax({
			url : "${pageContext.request.contextPath}/add/standardTicket",
			type : "POST",
			dataType : "json",
			data : {
				"userName" : userName,
				"operator_id" : operator_id
			},
			success : function(result) {
				var x = new Date(result.buyTime);
				x.toLocaleString();
				var buyDate = x + "";
				buyDate = buyDate.substring(0, buyDate.length - 21);
				var x = "<h3>打印票务信息:</h3></br>"
						+ "<svg id='barcode'></svg></br>" + result.barcode
						+ "</br>购票时间：" + buyDate + "</br>票的种类：标准票"
						+ "</br>票的价格：" + result.ticketPrice + " 元/票";
				document.getElementById('showImg').innerHTML = x;
				show(result.barcode);
			}
		})
	}
	function childTicket() {
		var userName = document.getElementById('userName').value;
		var operator_id = document.getElementById('operator_id').value;
		$.ajax({
			url : "${pageContext.request.contextPath}/add/childTicket",
			type : "POST",
			dataType : "json",
			data : {
				"userName" : userName,
				"operator_id" : operator_id
			},
			success : function(result) {
				var x = new Date(result.buyTime);
				x.toLocaleString();
				var buyDate = x + "";
				buyDate = buyDate.substring(0, buyDate.length - 21);
				var x = "<h3>打印票务信息:</h3></br>"
						+ "<svg id='barcode'></svg></br>" + result.barcode
						+ "</br>购票时间：" + buyDate + "</br>票的种类：儿童票"
						+ "</br>票的价格：" + result.ticketPrice + " 元/票";
				document.getElementById('showImg').innerHTML = x;
				show(result.barcode);
			}
		})
	}
	function studentTicket() {
		var userName = document.getElementById('userName').value;
		var school = document.getElementById('school').value;
		var operator_id = document.getElementById('operator_id');
		$.ajax({
			url : "${pageContext.request.contextPath}/add/studentTicket",
			type : "POST",
			dataType : "json",
			data : {
				"userName" : userName,
				"operator_id" : operator_id,
				"school" : school
			},
			success : function(result) {
				var x = new Date(result.buyTime);
				x.toLocaleString();
				var buyDate = x + "";
				buyDate = buyDate.substring(0, buyDate.length - 21);
				var x = "<h3>打印票务信息:</h3></br>"
						+ "<svg id='barcode'></svg></br>" + result.barcode
						+ "</br>购票时间：" + buyDate + "</br>票的种类：标准票</br>所在学校："
						+ result.schoolName + "</br>票的价格：" + result.ticketPrice
						+ " 元/票";
				document.getElementById('showImg').innerHTML = x;
				show(result.barcode);
			}
		})
	}
	function discountTicket() {
		var userName = document.getElementById('userName').value;
		var operator_id = document.getElementById('operator_id').value;
		var cause = document.getElementById('cause').value;
		var type = document.getElementById('type').value;
		$.ajax({
			url : "${pageContext.request.contextPath}/add/discountTicket",
			type : "POST",
			dataType : "json",
			data : {
				"userName" : userName,
				"operator_id" : operator_id,
				"cause" : cause,
				"type" : type
			},
			success : function(result) {
				var x = new Date(result.buyTime);
				x.toLocaleString();
				var buyDate = x + "";
				buyDate = buyDate.substring(0, buyDate.length - 21);
				var x = "<h3>打印票务信息:</h3></br>"
						+ "<svg id='barcode'></svg></br>" + result.barcode
						+ "</br>购票时间：" + buyDate + "</br>票的种类：优惠票</br>优惠原因："
						+ result.discountReason + "</br>优惠种类："
						+ result.discountType + "</br>票的价格："
						+ result.ticketPrice + " 元/票";
				document.getElementById('showImg').innerHTML = x;
				show(result.barcode);
			}
		})
	}
	function carTicket() {
		var userName = document.getElementById('userName').value;
		var operator_id = document.getElementById('operator_id').value;
		var carCode = document.getElementById('carCode').value;
		$.ajax({
			url : "${pageContext.request.contextPath}/add/carTicket",
			type : "POST",
			dataType : "json",
			data : {
				"userName" : userName,
				"operator_id" : operator_id,
				"carCode" : carCode
			},
			success : function(result) {
				var x = new Date(result.buyTime);
				x.toLocaleString();
				var buyDate = x + "";
				buyDate = buyDate.substring(0, buyDate.length - 21);
				var x = "<h3>打印票务信息:</h3></br>"
						+ "<svg id='barcode'></svg></br>" + result.barcode
						+ "</br>购票时间：" + buyDate + "</br>票的种类：标准票</br>车牌号："
						+ result.plateNumber + "</br>票的价格："
						+ result.ticketPrice + " 元/票";
				document.getElementById('showImg').innerHTML = x;
				show(result.barcode);
			}
		})
	}
	function touristTicket() {
		var operator_id = document.getElementById('operator_id2').value;
		var count = document.getElementById('count').value;
		var touristName = document.getElementById('touristName').value;
		var guideName = document.getElementById('guideName').value;
		$.ajax({
			url : "${pageContext.request.contextPath}/add/touristTicket",
			type : "POST",
			dataType : "json",
			data : {
				"operator_id" : operator_id,
				"count" : count,
				"touristName" : touristName,
				"guideName" : guideName,
			},
			success : function(result) {
				var y = "";
				for ( var i in result) {
					var x = new Date(result[i].buyTime);
					x.toLocaleString();
					var buyDate = x + "";
					buyDate = buyDate.substring(0, buyDate.length - 21);
					y = y	+ "<div sytle='border:red solid 1px'><h3>打印票务信息:</h3></br>"
							+ "<svg id='barcode"+i+"'></svg></br>"
							+ result[i].barcode + "</br>购票时间：" + buyDate
							+ "</br>票的种类：标准票</br>旅行社名称："
							+ result[i].touristName + "</br>导游姓名："
							+ result[i].touristName + "</br>旅游团人数："
							+ result[i].touristAmount + "</br>票的价格："
							+ result[i].ticketPrice + " 元/票</div>";
				}
				document.getElementById('showImg2').innerHTML = y;
				for ( var i in result) {
					showAll(result[i].barcode, i);
				}

			}
		})
	}

	function complimentaryTicket() {
		var operator_id = document.getElementById('operator_id2').value;
		var count = document.getElementById('count').value;
		var complimentaryAuthorizer = document
				.getElementById('complimentaryAuthorizer').value;
		var complimentaryPerson = document
				.getElementById('complimentaryPerson').value;
		$.ajax({
			url : "${pageContext.request.contextPath}/add/complimentaryTicket",
			type : "POST",
			dataType : "json",
			data : {
				"operator_id" : operator_id,
				"count" : count,
				"complimentaryAuthorizer" : complimentaryAuthorizer,
				"complimentaryPerson" : complimentaryPerson,
			},
			success : function(result) {
				var y = "";
				for ( var i in result) {
					var x = new Date(result[i].buyTime);
					x.toLocaleString();
					var buyDate = x + "";
					buyDate = buyDate.substring(0, buyDate.length - 21);
					y = y	+ "<div sytle='border:red solid 1px'><h3>打印票务信息:</h3></br>"
							+ "<svg id='barcode"+i+"'></svg></br>"
							+ result[i].barcode + "</br>购票时间：" + buyDate
							+ "</br>票的种类：标准票</br>赠票授权人："
							+ result[i].complimentaryAuthorizer + "</br>赠票对象："
							+ result[i].complimentaryPerson +"</br>票的价格："
							+ result[i].ticketPrice + " 元/票</div>";
				}
				document.getElementById('showImg2').innerHTML = y;
				for ( var i in result) {
					showAll(result[i].barcode, i);
				}

			}
		})

	}
</script>
</head>

<body class="no-skin">
	<!-- #section:basics/navbar.layout -->
	<div id="navbar" class="navbar navbar-default">

		<div class="navbar-container" id="navbar-container">
			<button type="button" class="navbar-toggle menu-toggler pull-left"
				id="menu-toggler">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>

			<div class="navbar-header pull-left">
				<!-- #section:basics/navbar.layout.brand -->
				<a href="index.html" class="navbar-brand"> <small> <img
						src="${pageContext.request.contextPath}/avatars/logo.png" alt="" />
				</small>
				公园门票系统
				</a>
			</div>

			<!-- #section:basics/navbar.dropdown -->
			<div class="navbar-buttons navbar-header pull-right"
				role="navigation">
				<ul class="nav ace-nav">

					

					<!-- #section:basics/navbar.user_menu -->
					<li class="light-blue"><a data-toggle="dropdown" href="#"
						class="dropdown-toggle"> <img class="nav-user-photo"
							src="${pageContext.request.contextPath}/avatars/user.jpg"
							alt="Jason's Photo" /> <span class="user-info"> 欢迎您<br />
								陈子昂
						</span> <i class="ace-icon fa fa-caret-down"></i>
					</a>

						<ul
							class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
							<li><a href="#"> <i class="ace-icon fa fa-cog"></i> 系统设置
							</a></li>

							<li><a href="profile.html"> <i
									class="ace-icon fa fa-user"></i> 个人信息设置
							</a></li>

							<li class="divider"></li>

							<li><a href="#"> <i class="ace-icon fa fa-power-off"></i>
									登出
							</a></li>
						</ul></li>

					<!-- /section:basics/navbar.user_menu -->
				</ul>
			</div>

			<!-- /section:basics/navbar.dropdown -->
		</div>
		<!-- /.navbar-container -->
	</div>

	<!-- /section:basics/navbar.layout -->
	<div class="main-container" id="main-container">

		<div id="sidebar" class="sidebar responsive">
			<ul class="nav nav-list">
				<li class="active"><a href="${pageContext.request.contextPath}/adminindex"> <i
						class="menu-icon fa fa-tachometer"></i> <span class="menu-text">
							首页 </span>
				</a> <b class="arrow"></b></li>

				<li class=""><a href="${pageContext.request.contextPath}/salepersonal"> <i
						class="menu-icon fa fa-desktop"></i> <span class="menu-text">售票界面
					</span>


				</a></li>
				
					<li class="active open">
						<a href="${pageContext.request.contextPath}/index" >
							<i class="menu-icon fa fa-pencil-square-o"></i>
							<span class="menu-text"> 售票数量 </span>

							
						</a>
								<b class="arrow"></b>
							</li>
				<li class="">
						<a href="amountofdifferentkind.jsp">
							<i class="menu-icon fa fa-list-alt"></i>
							<span class="menu-text"> 各类票的销售量 </span>
						</a>

						<b class="arrow"></b>
					</li>


					<li class="">
						<a href="money.jsp">
							<i class="menu-icon fa fa-picture-o"></i>
							<span class="menu-text">现金收入 </span>
						</a>

						<b class="arrow"></b>
					</li>



				
		</div>
		<!-- /section:basics/sidebar -->
		<div class="main-content">
			<!-- #section:basics/content.breadcrumbs -->
			<div class="breadcrumbs" id="breadcrumbs">
				<ul class="breadcrumb">
					<li><i class="ace-icon fa fa-home home-icon"></i></li>

				</ul>
				<!-- /.breadcrumb -->

				<!-- #section:basics/content.searchbox -->
				<div class="nav-search" id="nav-search">
					<form class="form-search">
						<span class="input-icon"> <input type="text"
							placeholder="请输入关键字 ..." class="nav-search-input"
							id="nav-search-input" autocomplete="off" /> <i
							class="ace-icon fa fa-search nav-search-icon"></i>
						</span>
					</form>
				</div>
				<!-- /.nav-search -->
			</div>

			<!-- /section:basics/content.breadcrumbs -->
			<div class="page-content">

				<!-- /section:settings.box -->
				<div class="page-content-area">

					<div class="row">
						<div class="col-xs-12">

							<div class="widget-box">
								<div class="widget-header widget-header-blue widget-header-flat">
									<h4 class="widget-title lighter">门票购买流程</h4>
								</div>

								<div class="widget-body">
									<div class="widget-main">
										<hr />
										<!-- #section:plugins/fuelux.wizard.container -->
										<div class="step-content pos-rel" id="step-container">
											<div class="step-pane active" id="step1">
												<h3 class="lighter block blue">购买单张票</h3>
												<form class="form-horizontal " id="validation-form">
													<div class="form-group">
														<label
															class="control-label col-xs-12 col-sm-3 no-padding-right"
															for="email">购票人姓名:</label>
														<div class="col-xs-12 col-sm-9">
															<div class="clearfix">
																<input type="hidden" name="operator_id" id="operator_id"
																	value="${sessionScope.user_code}"> <input
																	type="text" name="userName" id="userName"
																	class="col-xs-12 col-sm-6" />
															</div>
														</div>
													</div>

													<div class="space-2"></div>

													<div class="form-group">
														<label
															class="control-label col-xs-12 col-sm-3 no-padding-right"
															for="password">请选择票的种类:</label>

														<div class="col-xs-12 col-sm-9">
															<div class="clearfix">
																<select id="tickeType" onchange="changeTickeType()"
																	class="col-xs-12 col-sm-4">
																	<option value="标准票">标准票</option>
																	<option value="儿童票">儿童票</option>
																	<option value="学生票">学生票</option>
																	<option value="优惠票">优惠票</option>
																	<option value="车辆进出票">车辆进出票</option>
																</select>
															</div>
														</div>
													</div>

													<div class="space-2"></div>
													<!-- 根据选择不同的票，出现不同的输入框 -->
													<div id="content">
														<div class='form-group'>
															<div class='col-xs-12 col-sm-9'>
																<div class='clearfix'>
																	<input type='button' class='btn' value='确认购买'
																		onclick='standardTicket()'>
																</div>
															</div>
														</div>
														<div class='space-2'></div>
													</div>
													<!-- 打印条形码 -->
													<div id="showImg"></div>
											</div>
											<!-- /.col -->
										</div>
										<!-- /.row -->
									</div>
									<div class="widget-main">
										<hr />
										<!-- #section:plugins/fuelux.wizard.container -->
										<div class="step-content pos-rel" id="step-container">
											<div class="step-pane active" id="step1">
												<h3 class="lighter block blue">购买多张票</h3>
												<form class="form-horizontal " id="validation-form">
													<div class="form-group">
														<label
															class="control-label col-xs-12 col-sm-3 no-padding-right">请输入售票数量:</label>
														<div class="col-xs-12 col-sm-9">
															<div class="clearfix">
																<input type="hidden" name="operator_id2"
																	id="operator_id2" value="${sessionScope.user_code}">
																<input type="text" name="count" id="count"
																	class="col-xs-12 col-sm-6" />
															</div>
														</div>
													</div>
													<div class="space-2"></div>

													<div class="form-group">
														<label
															class="control-label col-xs-12 col-sm-3 no-padding-right"
															for="password">请选择票的种类:</label>

														<div class="col-xs-12 col-sm-9">
															<div class="clearfix">
																<select id="tickeType2" onchange="changeTickeType2()"
																	class="col-xs-12 col-sm-4">
																	<option value="touristTicket">旅游团体票</option>
																	<option value="complimentaryTicket">赠票</option>
																</select>
															</div>
														</div>
													</div>

													<div class="space-2"></div>
													<!-- 根据选择不同的票，出现不同的输入框 -->
													<div id="content2">
														<div class='form-group'>
															<label class='control-label col-xs-12 col-sm-3 no-padding-right'>旅行社名称：</label>
															<div class='col-xs-12 col-sm-9'>
																<div class='clearfix'>
																	<input type='text' name='touristName'
																		id='touristName' class='col-xs-12 col-sm-6' />
																</div>
															</div>
														</div>
														<div class='space-2'></div>
														<div class='form-group'>
															<label
																class='control-label col-xs-12 col-sm-3 no-padding-right'>导游名称：</label>
															<div class='col-xs-12 col-sm-9'>
																<div class='clearfix'>
																	<input type='text' name='guideName' id='guideName'
																		class='col-xs-12 col-sm-6' />
																</div>
															</div>
														</div>
														<div class='space-2'></div>
														<div class='form-group'>
															<div class='col-xs-12 col-sm-9'>
																<div class='clearfix'>
																	<input type='button' class='btn' value='确认购买'
																		onclick='touristTicket()'>
																</div>
															</div>
														</div>
														<div class='space-2'></div>
													</div>
													<!-- 打印条形码 -->
													</br></br></br></br></br></br>
													<div id="showImg2"></div>
											</div>
											<!-- /.col -->
										</div>
										<!-- /.row -->
									</div>
									<!-- /.page-content-area -->
								</div>
								<!-- /.page-content -->
							</div>
							<!-- /.main-content -->
							<!-- PAGE CONTENT ENDS -->
						</div>
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</div>
				<!-- /.page-content-area -->
			</div>
			<!-- /.page-content -->
		</div>
		<!-- /.main-content -->
		<div class="footer">
			<div class="footer-inner">
				<!-- #section:basics/footer -->
				<div class="footer-content"></div>

				<!-- /section:basics/footer -->
			</div>
		</div>

		<a href="#" id="btn-scroll-up"
			class="btn-scroll-up btn btn-sm btn-inverse"> <i
			class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>
	</div>
	<!-- /.main-container -->

	<!-- basic scripts -->

	<!--[if !IE]> -->
	<script type="text/javascript">
		window.jQuery
				|| document
						.write("<script src='${pageContext.request.contextPath}/js/jquery.min.js'>"
								+ "<"+"/script>");
	</script>

	<!-- <![endif]-->

	<!--[if IE]>
		<script type="text/javascript">
		 window.jQuery || document.write("<script src='${pageContext.request.contextPath}/js/jquery1x.min.js'>"+"<"+"/script>");
		</script>
		<![endif]-->
	<script type="text/javascript">
		if ('ontouchstart' in document.documentElement)
			document
					.write("<script src='${pageContext.request.contextPath}/js/jquery.mobile.custom.min.js'>"
							+ "<"+"/script>");
	</script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

	<!-- page specific plugin scripts -->
	<script
		src="${pageContext.request.contextPath}/js/fuelux/fuelux.wizard.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/jquery.validate.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/additional-methods.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootbox.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/jquery.maskedinput.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/select2.min.js"></script>

	<!-- ace scripts -->
	<script src="${pageContext.request.contextPath}/js/ace-elements.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/ace.min.js"></script>

	<!-- inline scripts related to this page -->

</body>
</html>