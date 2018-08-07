<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form commandName="login">
Name:<form:input path="name"/>
<form:errors path="name"></form:errors>
<br>
Password:<form:password path="pass"/>
<form:errors path="pass"></form:errors>
<br>
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form:form>
</body>
</html>