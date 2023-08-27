<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.shopNest.dbHandler.DataFetcher" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <style>
      .tab1,
      .tab2,
      .tab3 {
        display: none;
      }
    </style>
  </head>
  <body>
    <div class="button-container">
      <button id="viewCustomers" onclick="myFun('tab1')">View Customers</button>
      <button id="viewProducts" onclick="myFun('tab2')">View Products</button>
      <button id="addCustomers" onclick="myFun('tab3')">Add Customers</button>
      <br />
    </div>

    <div class="tab1">
      <table border="">
        <thead>
          <td>Username</td>
          <td>Email</td>
          <td>Gender</td>
          <td>Address</td>
        </thead>
        
        <% List<String> a = DataFetcher.getCustomerDetails(); %>
        <% for(int i=0;i<a.size();i++){  String data[] = ((String)a.get(i)).split(":"); %>
        <tr>
            <td><%=data[0] %></td>
            <td><%=data[1] %></td>
            <td><%=data[2]%></td>
            <td><%=data[3]%></td>

        </tr>
        <%} %>
      </table>
      
    </div>

   <div class="tab2">
      <table border="">
        <thead>
          <td>pid</td>
          <td>pname</td>
          <td>Description</td>
          <td>Price</td>
          <td>Product Image</td>
        </thead>
        <tr>
        <% List<String> products = DataFetcher.getProductDetails(); %>
        <%for(int i=0;i<products.size();i++){ String[] s = products.get(i).split(":");            %>
<td><%= s[0] %></td>
<td><%= s[1] %></td>
<td><%= s[2] %></td>
<td><%= s[3] %></td>
<td><image src="Images/<%=s[4] %>">    </td>
        </tr>
        <%} %>
      </table>
    </div>
			
   
    <div class="tab3">
        <form action="addP" method="post">
            <table >
        <tr>
            
              <td>
                <label for="pid">Product id</label>
            </td><td>
                <input type="text" id="pid" name="pid">
            </td>
        </tr>
        <tr>
              <td>
                <label for="pname">Product Name</label>
            </td><td>
                <input type="text" id="pname" name="pname">
            </td><td>
        </tr>
        <tr>
              <td>
                <label for="pdesc">Product Description</label>
              </td><td>
                <textarea rows="2" cols="40" id="pdesc" name="pdesc"></textarea>
              </td>
        </tr>
        <tr>
              <td>
                <label for="pprice">Price</label>
            </td><td>
                <input type="text" id="pprice" name="pprice">
              </td>
            </tr><tr>
              <td>
                <label for="pimg">Image name</label>
            </td><td>
                <input type="text" id="pimg" name="pimg">
              </td>
            </tr>
        
        </table>
        <input type="submit" value="submit">
        </form>
    </div>

    <script>
      function myFun(id) {
        var elements = document.querySelectorAll(".tab1, .tab2, .tab3");
        elements.forEach(function (element) {
          element.style.display = "none";
        });

        var elementToShow = document.querySelector("." + id);
        elementToShow.style.display = "block";
      }
    </script>
  </body>
</html>
