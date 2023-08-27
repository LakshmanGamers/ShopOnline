package com.shopNest.dbHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DataFetcher {
	public static String fetchPassword(String un) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:Oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "qwerty@123";
		String sql = "SELECT pass from customer where uname=?";
		String dbPass = "";
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pass);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, un);
			ResultSet rs = ps.executeQuery();
			rs.next();
			dbPass =	rs.getString(1);
		}
		catch(Exception e) {
			
			e.printStackTrace();
			System.out.print("not done");
		}
		finally {
return dbPass;
		}
		
	}
	

	public static List<String> getCustomerDetails() {
	    List<String> customerDetails = new ArrayList<>();
	    String driver = "oracle.jdbc.driver.OracleDriver";
	    String url = "jdbc:Oracle:thin:@localhost:1521:xe";
	    String user = "system";
	    String pass = "qwerty@123";
	    String sql = "SELECT uname, mail, gender, address FROM customer";
	    
	    try {
	        Class.forName(driver);
	        Connection con = DriverManager.getConnection(url, user, pass);
	        PreparedStatement ps = con.prepareStatement(sql);
	        
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()) {
	            String details = rs.getString("uname") + ":" +
	                             rs.getString("mail") + ":" +
	                             rs.getString("gender") + ":" +
	                             rs.getString("address");
	            customerDetails.add(details);
	            
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    System.out.print(customerDetails);
	    return customerDetails;
	}
	public static List<String> getProductDetails() {
	    List<String> productDetails = new ArrayList<>();
	    String driver = "oracle.jdbc.driver.OracleDriver";
	    String url = "jdbc:Oracle:thin:@localhost:1521:xe";
	    String user = "system";
	    String pass = "qwerty@123";
	    String sql = "SELECT pid,pname,pdesc,pprice,pimg FROM product";
	    
	    try {
	        Class.forName(driver);
	        Connection con = DriverManager.getConnection(url, user, pass);
	        PreparedStatement ps = con.prepareStatement(sql);
	        
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()) {
	            String details = String.valueOf(rs.getInt("pid")) + ":" +
	                             rs.getString("pname") + ":" +
	                             rs.getString("pdesc") + ":" +
	                             String.valueOf(rs.getInt("pprice"))+":"+
	                             rs.getString("pimg");
	            
	            productDetails.add(details);
	            
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    finally {
	    System.out.print(productDetails);
	    return productDetails;
	}
	}

}



	

	
