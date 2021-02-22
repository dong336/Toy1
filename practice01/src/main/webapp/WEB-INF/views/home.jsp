<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
	<title>Home</title>
	
	<link rel="stylesheet" href="/node_modules/tui-grid/dist/tui-grid.css" >
	<link rel="stylesheet" href="/node_modules/tui-grid/dist/tui-grid.min.css">

	<link rel="stylesheet" href="/resources/css/home.css">
</head>
<body>
	<div id="left_frame">
		<h1>Hello, World!</h1>
		<p id="test"></p>
	</div>
	
	<div id="frame">
        <div id="grid"></div>
        <div>
            <br>
            <button id="btnClear">초기화</button>
            <button id="btnSearch">조회</button>
        </div>
    </div>
	
	<!--  -->	
	<script type="text/javascript" src="/node_modules/jquery/dist/jquery.min.js"></script>

	<!-- tui grid import -->
	<script type="text/javascript" src="/node_modules/tui-grid/dist/tui-grid.js"></script>
	<script type="text/javascript" src="/node_modules/tui-grid/dist/tui-grid.min.js"></script>  
	
	<!-- things -->
 	<script type="text/javascript" src="/resources/js/home.js"></script>
</body>
</html>