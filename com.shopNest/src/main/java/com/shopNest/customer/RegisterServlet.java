package com.shopNest.customer;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.shopNest.dbHandler.*;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet{
 public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
	 String uname = req.getParameter("user");
	 String mail  = req.getParameter("mail");
	 String pass  = req.getParameter("pass");
	 String gend  = req.getParameter("gender");
	 String addr  = req.getParameter("address");
	 
	 String status = DataInjector.addCustomer(uname,mail,pass,gend,addr);
	 
	 res.sendRedirect("login.jsp");
 }
}
