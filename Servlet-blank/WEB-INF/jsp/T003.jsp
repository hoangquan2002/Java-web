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

</style>
</head>
<body style="background-color: rgb(204, 255, 255);">

	<div
		style="padding: 10px; color: red; font-size: 25px; font-weight: bold;">Training</div>
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
                <td><label for="customerID"><%= request.getParameter("lblCustomerID") %></label></td>
            </tr>
            <tr>
                <td>Customer Name:</td>
                <td><input type="text" id="txtCustomerName" name="customerName"></td>
            </tr>
            <tr>
                <td>Sex:</td>
                <td>
                    <select id="cboSex" name="sex">
                    	<option value=""></option>
						<option value="Male">Male</option>
						<option value="Female">Female</option>
				</select>
                </td>
            </tr>
            <tr>
                <td>Birthday:</td>
                <td><input type="text" id="txtBirthday" name="birthday"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" id="txtEmail" name="email"></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><textarea id="txaAddress" name="address" rows="4" cols="30"></textarea></td>
            </tr>
        </table>
        <input type="submit" value="Submit">
	</form>
	</center>


</body>
</html>