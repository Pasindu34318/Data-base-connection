<%-- 
    Document   : index
    Created on : Mar 14, 2025, 9:45:25 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="insertUser" method="post"> 
            
            <h2> Insert User Forme </h2>
            
            <label> Username: </label>
            <input type="text" name="username" plaseholder="User Name" required>
            <br>
            <lable> Email: </lable>
            <input type="email" name="email" plaseholder="Email" required >
            <br>
            <input type="submit" value="Insert User" >
        </form>
        
        <form action="deleteUser" method="post" > 
            
            <h2> Delete User Form </h2>
            
            <lable> User Id: </lable>
            <input type="number" name="id" required >
            <br>
            <input type="submit" value="Delete User" >
            
        </form>
        
    </body>
</html>
