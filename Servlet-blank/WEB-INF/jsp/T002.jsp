<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SEARCH TRAINING</title>

</head>
<body style="background-color: rgb(204, 255, 255); width: 99%;">
	<div
		style="padding: 8px; color: red; font-size: 25px; font-weight: bold;">Search</div>
	<hr width="100%" align="center" color="black" size="1" />
	<div style="padding: 8px;">Login > Search Customer</div>
	<div class="container">
		<div id="welcome">Welcome ${username}</div>
		<div><a href="#" onclick="logOut()" id="logout">Log Out</a></div>

	</div>
	<hr width="100%" align="center" color="black" size="1" />

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

	<button onclick="firstPage()" class="common1-button">&lt;&lt;</button>
	<button onclick="previousPage()" class="common1-button">&lt;</button>
	<button onclick="lastPage()" class="common2-button" style="float: right">&gt;&gt;</button>
	<button onclick="nextPage()" class="common2-button" style="float: right">&gt;</button>

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
				<td><a href="T003?customerId=${i.customerId}">${i.customerId}</a></td>
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
.container {
    display: flex;
    justify-content: space-between;
    padding: 8px;
}

body {
            background-color: rgb(204, 255, 255);
            margin: 0;
            padding: 0;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            border: 2px solid green; 
        }

        th, td {
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: green;
            color: white;
        }

        tr:nth-child(even) {
            background-color: rgb(204, 255, 255);
        }

        tr:nth-child(odd) {
            background-color: white; 
        }
</style>
</body>
<script>
var ind = parseInt('<%= session.getAttribute("index") != null ? session.getAttribute("index") : "0" %>');
var total = parseInt('<%= session.getAttribute("totalPage") != null ? session.getAttribute("totalPage") : "0" %>');

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
function firstPage() {    
    document.getElementById('mode').value = 'first';
    document.getElementById('Form').submit();
}
function lastPage() {    
    document.getElementById('mode').value = 'last';
    document.getElementById('Form').submit();
    
    
}
function disableButton() {
	var nextButton = document.querySelectorAll(".common2-button"); 
	if(ind>=total){		   
		nextButton.forEach(function(button) {
	    button.disabled = true;
	    });
    }
	var preButton = document.querySelectorAll(".common1-button"); 
	if(ind <= 0){		   
		preButton.forEach(function(button) {
	    button.disabled = true;
	    });
    }
	
}
disableButton();

function logOut(){    
    document.getElementById('mode').value = 'logout';
    document.getElementById('Form').submit();
}


</script>
</html>
