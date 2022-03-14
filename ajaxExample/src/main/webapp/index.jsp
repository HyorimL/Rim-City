<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <form action="main.do">
<input type="submit">
</form> -->

<div id="show"></div>

<script>
var xhtp = new XMLHttpRequest();   //ajax : 비동기방식 데이터요청 처리
xhtp.open('get', 'data.json');
xhtp.send();
xhtp.onload = function() {
	var result = xhtp.responseText;
	result = JSON.parse(result);  // json -> object 변경
	console.log(result);
	var show = document.getElementById("show");
	var tag = "<ul>";
	for(let i=0; i<result.length; i++) {
		console.log('이름: ' + result[i].name + ', 나이: ' + result[i].age);
		tag += '<li>이름: ' + result[i].name + ', 나이: ' + result[i].age + '</li>';
	}
	tag += "</ul>";
	show.innerHTML = tag; 
	//console.log('이름:' + result.name + ', 나이:' + result.age);
	//var tag = "<h3>이름: " + result.name + ", 나이: " + result.age + "</h3>";
	//show.innerHTML = tag;
}
</script>
</body>
</html>