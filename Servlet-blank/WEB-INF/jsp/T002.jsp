<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SEARCH TRAINING</title>

<script>
function previousPage() {
    // Navigate to the previous page logic
    // You can implement this according to your requirement
    // For example, you can use AJAX to load previous data
}

function nextPage() {
    // Navigate to the next page logic
    // You can implement this according to your requirement
    // For example, you can use AJAX to load next data
}
</script>

</head>
<body style="background-color: rgb(204, 255, 255);">
	<div
		style="padding: 10px; color: red; font-size: 25px; font-weight: bold;">Training</div>
	<hr width="100%" align="center" color="black" size="1" />
	<div style="padding: 8px;">Login > Search Customer</div>
	<div class="container">
		<div id="welcome">Welcome ${username}</div>
		<div id="logout">Log Out</div>
	</div>
	<hr style="" />

	<form id="searchForm" method="post" action="T002">
		<label for="customerName">Customer Name:</label> <input type="text"
			id="txtCustomerName" name="customerName"> <label id="cboSex"
			for="sex"> Sex: </label> <select id="sex" name="sex">
			<option value=""></option>
			<option value="M">Male</option>
			<option value="F">Female</option>
		</select> <label for="birthdayFrom">Birthday </label> <input type="text"
			id="txtBirthdayForm" name="birthdayFrom"> <label
			for="birthdayTo">~</label> <input type="text" id="txtBirthdayTo"
			name="birthdayTo">
		<button type="submit" id="btnSearch" class="common-button"
			style="float: right">Search</button>
	</form>

	<button onclick="previousPage()" class="common-button">&lt;&lt;</button>
	<button onclick="previousPage()" class="common-button">&lt;</button>
	<button onclick="nextPage()" class="common-button" style="float: right">&gt;&gt;</button>
	<button onclick="nextPage()" class="common-button" style="float: right">&gt;</button>

	<table>
		<tr>
			<th>Customer ID</th>
			<th>Customer Name</th>
			<th>Sex</th>
			<th>Birthday</th>
			<th>Address</th>
		</tr>
		<c:forEach items="${listAccount}" var="i">
			<tr>
				<td><a href="T003.jsp?customerId=${i.customerId}">${i.customerId}</a></td>
				<td>${i.customerName}</td>
				<td>${i.sex}</td>
				<td>${i.birthday}</td>
				<td>${i.address}</td>
			</tr>
		</c:forEach>
	</table>




	<!-- Navigation buttons -->

	<button onclick="addNew()">Add New</button>
	<button onclick="delete()">Delete</button>


	<hr width="100%" align="center" color="black" size="1" />
	<div style="padding: 8px 30px; font-size: 10px">Copyright
		(c)2000-2008 FUJINET, All Rights Reserved.</div>

	<style>
/* Your existing styles */
</style>
</body>
</html>
