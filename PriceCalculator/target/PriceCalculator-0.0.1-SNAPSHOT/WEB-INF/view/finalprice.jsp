<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="webjars/bootstrap/4.4.1-1/css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
<title><spring:message code="thankyou.text" /></title>
</head>
<body>
	<h3 class="colors">
		<spring:message code="product.heading" />
	</h3>

	<p class="colors"><spring:message code="price.msg" /> ${totalCost}</p>
</body>
</html>