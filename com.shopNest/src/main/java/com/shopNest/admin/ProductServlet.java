package com.shopNest.admin;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.shopNest.dbHandler.*;

@WebServlet("/addP")
public class ProductServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		int id =  Integer.parseInt(req.getParameter("pid"));
		String pname = req.getParameter("pname");
		int pprice =Integer.parseInt( req.getParameter("pprice"));
		String pdesc = req.getParameter("pdesc");
		String pimg = req.getParameter("pimg");
		
		String status = DataInjector.addProduct(id, pname, pdesc, pprice, pimg);
		res.sendRedirect("admin.jsp");
	}
}
