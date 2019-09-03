<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	$(function (){
		$.ajax({
			url:"<%=request.getContextPath()%>/deptList.do",
			type:"post",
			dataType:"json",
			success:function (obj){
				for(var i in obj){
					$("[name='dept.did']").append("<option value="+obj[i].did+">--"+obj[i].dname+"--</option>");
				}
			}
		})
	})
	
</script>
</head>
<body>
	<form action="<%=request.getContextPath() %>/add.do" method="post">
		用户名:<input type="text" name="uname">
		密码：<input type="text" name="password">
		成绩：<input type="text" name="score">
		部门：<select name="dept.did">
			<option value="">--请选择--</option>
		</select>
		<input type="submit">
	</form>
</body>
</html>