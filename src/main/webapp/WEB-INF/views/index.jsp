<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>CreditCard-Home Page</title>
	</head>
	<body>
		<h1>Check for Credit Card Eligibility</h1>
		<form:form action="checkEligibility" method="post">
			<table>
				<tr>
					<td><form:label path="panNumber">Enter PAN Number</form:label></td>
					<td><form:input id="panNo" path="panNumber"  required="required" pattern="[a-zA-Z0-9]{10}" title="10 character alpha numeric"/></td>
				</tr>
			         <tr>
               <td colspan="2"><button id="submit"  type="submit">Check</button></td>
              
            </tr>
			</table>
		</form:form>
	</body>
</html>


