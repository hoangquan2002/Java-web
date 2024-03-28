<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SEARCH TRAINING</title>

</head>
<body style="background-color: rgb(204, 255, 255);">
	<div
		style="padding: 10px; color: red; font-size: 25px; font-weight: bold;">Training</div>
	<hr width="100%" align="center" color="black" size="1" />
	<div style="padding: 8px;">Login > Search Customer</div>
	<div class="container">
		<div id="welcome">Welcome ${username}</div>
		<div><a href="#" onclick="logOut()" id="logout">Log Out</a></div>

	</div>
	<hr style="" />

	<form id="Form" method="post" action="T002">
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
		<button onclick="search()" id="btnSearch" class="common-button"
			style="float: right">Search</button>
		<input type="hidden" id="mode" name="mode" value=""> 
		<input type="submit" style="display: none;">

	</form>

	<button onclick="firstPage()" class="common-button">&lt;&lt;</button>
	<button onclick="previousPage()" class="common-button">&lt;</button>
	<button onclick="lastPage()" class="common-button" style="float: right">&gt;&gt;</button>
	<button onclick="nextPage()" class="common-button" style="float: right">&gt;</button>

	<table>
		<tr>
			<th>Customer ID</th>
			<th>Customer Name</th>
			<th>Sex</th>
			<th>Birthday</th>
			<th>Address</th>
		</tr>
		<c:forEach items="${bathList}" var="i">
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
#logout {
padding: 8px;
float: right;
}
</style>
</body>
<script>
function search() {    
    document.getElementById('mode').value = 'search';
    document.getElementById('Form').submit();
}
function nextPage() {    
    document.getElementById('mode').value = 'next';
    document.getElementById('Form').submit();
}
function previousPage() {    
    document.getElementById('mode').value = 'previous';
    document.getElementById('Form').submit();
}
function logOut(){    
    document.getElementById('mode').value = 'logout';
    document.getElementById('Form').submit();
}


</script>
</html>
