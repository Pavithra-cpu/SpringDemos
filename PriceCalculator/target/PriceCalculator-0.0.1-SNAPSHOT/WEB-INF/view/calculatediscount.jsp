<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Price Discount Calculator</title>
<link rel="stylesheet"
	href="webjars/bootstrap/4.4.1-1/css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<h3 class="colors">
		<spring:message code="product.heading" />
	</h3>
	<div>
		<a href="http://localhost:8080/getDiscountedPrice?lang=en"><spring:message code="english.lang"/></a>
		<a href="http://localhost:8080/getDiscountedPrice?lang=de"><spring:message code="german.lang"/></a>
		<a href="http://localhost:8080/getDiscountedPrice?lang=fr"><spring:message code="french.lang"/></a>
	</div>
	<div>
		<form:form action="finalprice" modelAttribute="product">
			<table>
				<tr>
					<td class="colors"><spring:message code="product.price" /></td>
					<td><form:input path="productPrice" type="number" /></td>
					<form:errors path="productPrice"> <spring:message code="Product.DecimalMin.productPrice" /></form:errors>
				</tr>
				<tr>
					<td class="colors"><spring:message code="product.type" /></td>
					<td><form:select items="${productTypeList}" path="productType" /></td>
				</tr>

				<tr>
					<td><button class="btn btn-success" type="submit"
							value="Calculate">
							<spring:message code="button.submit" />
						</button></td>
					<td><button class="btn btn-danger" type="reset">
							<spring:message code="button.clear" />
						</button></td>
				</tr>
			</table>
		</form:form>
	</div>
	<script src="webjars/jquery/3.4.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/4.4.1-1/js/bootstrap.min.js"></script>
</body>
</html>