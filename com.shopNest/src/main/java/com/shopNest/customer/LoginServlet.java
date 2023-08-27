package com.shopNest.customer;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.shopNest.dbHandler.*;

@WebServlet("/log")
public class LoginServlet extends HttpServlet{

	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		String uname = req.getParameter("uname");
		String pswd = req.getParameter("pass");
		if(uname.equals("admin") && (Validator.isValid(uname, pswd)==true)) {
			res.sendRedirect("admin.jsp");
		}
		else if(Validator.isValid(uname, pswd)==true) {
		res.sendRedirect("home.jsp");
		}
		else {
			res.sendRedirect("login.jsp");
		}
	}
}
