<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link rel="stylesheet" href="/node_modules/tui-grid/dist/tui-grid.css" >
	<link rel="stylesheet" href="/node_modules/tui-grid/dist/tui-grid.min.css">
</head>
<body>
	<div id="grid">
	</div>
	<br>
	<div>
	    <button id="btnClear">clear</button>
	    <button id="btnSearch">view</button>
	</div>
	
	<script type="text/javascript" src="/node_modules/jquery/dist/jquery.min.js"></script>

	<!-- tui grid import -->
	<script type="text/javascript" src="/node_modules/tui-grid/dist/tui-grid.js"></script>
	<script type="text/javascript" src="/node_modules/tui-grid/dist/tui-grid.min.js"></script>  
	<script type="text/javascript">
	
	var gridData = [];
	var grid = null;

	grid = new tui.Grid({
	   el: document.getElementById('grid'),
	   data: gridData,
	   scrollX: false,
	   scrollY: false,
	   columns: [
	        {
	            header: 'Name',
	            name: 'name'
	        },
	        {
	            header: 'Artist',
	            name: 'artist'
	        },
		    {
		        header: 'Type',
		        name: 'type'
		    },
		    {
		        header: 'Release',
		        name: 'release'
		    },
		    {
		        header: 'Genre',
		        name: 'genre'
		    }
		    ]
	});
	
	    
	$("#btnClear").click(function(){
	    grid.clear();
	});
	  
	$("#btnSearch").click(function(){
	    $.ajax({
		    url : '/async/data', 
		    method : 'get',
	        data : null,
		    dataType : 'JSON',
		    error : function(){
		        alert('error');
		    },
		    success : function(data){
	    		console.dir(data.dataList);
	    		grid.resetData(eval(data.dataList));
			} 
	    });
	}); 
	</script>
</body>
</html>