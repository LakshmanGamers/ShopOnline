<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <div class="Login">
        <h1>Login Here</h1>
        <form action="log" method="post">
            <table>
               <tr>
                <td> <label for="uname" >Username :</label> </td>
                <td> <input type="text" name="uname"></td>
               </tr>
               
               <tr>
                <td> <label for="pass" >Password :</label> </td>
                <td> <input type="password" name="pass"></td>
               </tr>
               <tr>
                <td> <input type="submit" value="SUBMIT"> </td>
               </tr>
            </table>
        </form>
    </div>
</body>
</html>