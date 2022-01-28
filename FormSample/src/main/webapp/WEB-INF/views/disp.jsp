<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FORMサンプル</title>
</head>
<body>
	<p>名前を入力して下さい</p>

	<form:form modelAttribute="formModel">
		名前<form:input path="name" />
		住所<form:input path="address" />
		<input type="submit" value="送信" />
	</form:form>
	<p>${message}</p>
	<p>${address}</p>
</body>

</html>