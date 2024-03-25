<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8; width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body style="background-color: rgb(204, 255, 255);">
<div style="padding: 10px 30px; color: red; font-size: 25px; font-weight: bold;">Training</div>
<hr width="98%" align="center" color="black" size="1" />
<div style="padding: 8px 30px;">Login</div>
<center>
    <div style="padding: 60px 30px 30px; font-size: 24px; color: rgb(51, 157, 255); font-weight: bold;">Login</div>
    <%
        String errorMessage = "";
        if (request.getAttribute("errorMessage") != null) {
            errorMessage = (String) request.getAttribute("errorMessage");
        }
    %>
    <div class="error-message"><%=errorMessage%></div>
</center>

<center>
    <form method="post" action="T001">
        <table>
            <tr>
                <td>User ID：</td>
                <td><input type="text" id="username" name="username"></td>
            </tr>
            <tr>
                <td>Password：</td>
                <td><input type="password" id="password" name="password"></td>
            </tr>
            <tr style="padding: 20px">
                <td><input type="submit" id="button" value="Login"></td>
                <td><button type="button" id="button" onclick="clearform()">Clear</button></td>
            </tr>
        </table>
    </form>
</center>
<div style="padding: 140px"></div>
<hr width="98%" align="center" color="black" size="1" />
<div style="padding: 8px 30px; font-size: 10px">Copyright (c) 2000-2008 FUJINET, All Rights Reserved.</div>

<style>
    input#username, input#password {
        border-top: 3px solid black;
        border-left: 3px solid black;
        border-bottom: 1px solid black;
        border-right: 1px solid black;
    }

    input#button {
        background-color: rgb(192, 192, 192);
        margin-left: 40px;
        margin-top: 40px;
        border-bottom: 3px solid black;
        border-right: 3px solid black;
    }

    button {
        background-color: rgb(192, 192, 192);
        margin-left: 150px;
        margin-top: 40px;
        border-bottom: 3px solid black;
        border-right: 3px solid black;
    }

    table, tr, td {
        text-align: left;
    }

    th, tr, td {
        padding: 4px 8px;
    }

    tr:first-child {
        background-color: black
    }

    table {
        margin: 10px;
    }

    .error-message {
        color: red;
    }
</style>
<script>
    function clearform() {
        window.location.href = "T001";
    }
</script>
</body>
</html>
