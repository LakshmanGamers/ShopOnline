<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.shopNest.dbHandler.DataFetcher" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<style>
     .class1{
        display: grid;
        grid-template-columns: auto auto ;
        padding: 5px;
        margin: 5px;
        column-gap: 10px;
        row-gap: 10px;
    }
    .item{
       border: 2px solid black;
        padding: 5px;
    }
    header{
        font-size: 50px;
        background-color: black;
        color: white;
        text-align: center;
        font-family:'Times New Roman', Times, serif;
    }
    .item{
        display: grid;
        align-items:center;
        padding-left: 40%;
    }
    item:hover{
    border : 4px solid black;
    }
    #head2{
        font-size: 20px;
    }
</style>
<body>
    <header >Welcome to ShopNest</header>
    <header id="head2">Your Shopping Starts Here!</header>
     
    <div class="class1">
    <% List<String> products = DataFetcher.getProductDetails(); %>
        <%for(int i=0;i<products.size();i++){ String[] s = products.get(i).split(":");            %>
        <div class="item" >
       
            <p><image src="Images/<%=s[4] %>" height="200px"></p>
            <p> <%= s[1] %></p>
            <p> <%= s[2] %></p>
            <p> <%= s[3] %></p>
       
        </div>
         <%} %>    
    </div>
</body>
</html>