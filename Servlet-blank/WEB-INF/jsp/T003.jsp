<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
#welcome {
	padding: 8px;
	float: left;
}

#logout {
	padding: 8px;
	float: right;
}

#editForm {
	
}
<style>
body {
    background-color: rgb(204, 255, 255);
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
}

#welcome {
    padding: 8px;
    float: left;
}

#logout {
    padding: 8px;
    float: right;
}

#editForm {
    padding: 20px; 
}

table {
    width: 100%;
}

td {
    padding: 10px; 
}

input[type="text"],
select,
textarea {
    width: calc(100% - 20px); 
    padding: 8px;
    margin-bottom: 10px; 
    box-sizing: border-box;
}

button {
    padding: 12px 20px; 
    cursor: pointer;
    background-color: #4CAF50; 
    color: white; 
    border: none;
    border-radius: 5px;
    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1); 
}

button:hover {
    background-color: #45a049; 
}

button:active {
    background-color: #3e8e41; 
}

button:focus {
    outline: none;
}
</style>

</style>
</head>
<body style="background-color: rgb(204, 255, 255);">

	<div
		style="padding: 10px; color: red; font-size: 25px; font-weight: bold;">Detail customer</div>
	<hr width="100%" align="center" color="black" size="1" />
	<div style="padding: 8px;">Login > Search Customer</div>
	<div class="container">
		<div id="welcome">Welcome ${username}</div>
		<a href="#" id="logout" onclick="logOut()">Log Out</a>
	</div>
	<hr width="100%" align="center" color=#3366ff size="10" />
	<center>
		<form action="T003" method="post" id="editForm">
			<table>
				<tr>
					<td>Customer ID:</td>
					<td><label for="customerID">${customerId}</label></td>
				</tr>
				<tr>
					<td>Customer Name:</td>
					<td><input type="text" id="txtCustomerName"
						name="customerName" value="${customerName}"></td>
				</tr>
				<tr>
					<td>Sex:</td>
					<td><select id="cboSex" name="sex">
							<option value="" ></option>
							<option value="M" ${sex eq 'M' ? 'selected' : ''}>Male</option>
                        <option value="F" ${sex eq 'F' ? 'selected' : ''}>Female</option>
					</select></td>

				</tr>
				<tr>
					<td>Birthday:</td>
					<td><input type="text" id="txtBirthday" name="birthday" value="${birthday}"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="text" id="txtEmail" name="email" value="${email}"></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><textarea id="txaAddress" name="address" rows="4"
							cols="30" >${address}</textarea></td>
				</tr>
			</table>
			<button onclick="save()" id="btnSave" class="common-button">Save</button>
			<input type="hidden" id="mode" name="mode" value=""> 
		<input type="submit" style="display: none;">
			
		</form>
	</center>
<script type="text/javascript">
function save() {    
    document.getElementById('mode').value = 'save';
    document.getElementById('editForm').submit();
    
    
}

function logOut(){    
    document.getElementById('mode').value = 'logout';
    document.getElementById('editForm').submit();
}
</script>
</body>
</html>