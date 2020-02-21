<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

 pageEncoding="ISO-8859-1" isELIgnored="false"%>





<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<body style="background-color: lavender">

 <h1>

 <center>Welcome to Online Help Services</center>

 </h1>

 <form:form action="/helpDesk" method="post" modelAttribute="helper">

 <center>

  <table>

  <tr>

   <td><form:label path="serviceType">Choose Service:</form:label></td>

   <td><form:select path="serviceType" id="serviceType"

    items="${serviceList}" /></td>

  </tr>

  <tr>

   <td><form:label path="noOfHours">Total Hours Service Required</form:label></td>

   <td><form:input path="noOfHours" type="text" id="noOfHours" /></td>

  </tr>

  <tr>

   <td><button type="submit" name="submit">TotalCost</button></td>

   <td><button type="reset"></button>Cancel</td>

  </tr>



  </table>



 </center>







 </form:form>





</body>

</html>