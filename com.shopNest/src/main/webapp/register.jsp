<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        table{
            align-items: center;
            position: relative;
        }
    </style>
</head>
<body>
    <div class="registration">
        <h1>Register Here</h1>
        <form action="reg" method="post">
            <table>
                <tr>
                    <td><label for="username">Username:</label></td>
                    <td><input type="text" id="username" name="user"></td>
                </tr>
                <tr>
                    <td><label for="email">Mail:</label></td>
                    <td><input type="email" id="email" name="mail"></td>
                </tr>
                <tr>
                    <td><label for="password">Password:</label></td>
                    <td><input type="password" id="password" name="pass"></td>
                </tr>
                <tr>
                    <td><label>Gender:</label></td>
                    <td>
                        <label for="male">Male</label>
                        <input type="radio" id="male" name="gender" value="Male">
                        <label for="female">Female</label>
                        <input type="radio" id="female" name="gender" value="Female">
                        <label for="other">Other</label>
                        <input type="radio" id="other" name="gender" value="Other">
                    </td>
                </tr>
                <tr>
                    <td><label for="address">Address:</label></td>
                    <td><textarea id="address" rows="2" cols="20" name="address"></textarea></td>
                </tr>
            </table>
            <input type="submit" value="submit"> 
        </form>
    </div>
</body>
</html>
