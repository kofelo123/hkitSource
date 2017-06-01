<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>


$(document).ready(function(){

	var formObj = $("form[role='form']");
	
	console.log(formObj);
	
	$(".btn-warning").on("click", function(){
		formObj.attr("action","/board/modify");
		formObj.attr("method","get");
		formObj.submit();
		
	});
	
	$(".btn-danger").on("click",function()){
		formObj.attr("action", "/board/remove");
		formObj.submit();
	});
	
	$(".btn-primary").on("click",function(){
		self.location = "/board/listAll";
	});
	
});
</body>
</html>