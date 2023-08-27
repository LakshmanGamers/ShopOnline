package com.shopNest.dbHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DataInjector {
	public static String addCustomer(String uname , String mail , String pswd ,String gender,String addr ) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:Oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "qwerty@123";
		String sql = "INSERT INTO customer VALUES(?,?,?,?,?)";
		String status = "";
		
		try {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,pass);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, uname);
		ps.setString(2, mail);
		ps.setString(3, pswd);
		ps.setString(4, gender);
		ps.setString(5, addr);
		ps.executeUpdate();
		status = "Success";
		
		System.out.print("done");
		}
		catch(Exception e) {
			status = "falied";
			e.printStackTrace();
			System.out.print("not done");
		}
		finally {
return status;
		}
		
	}	
	
	public static String addProduct(int id,String name , String desc,int price, String img) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:Oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "qwerty@123";
		String sql = "INSERT INTO product VALUES(?,?,?,?,?)";
		String status = "";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pass);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setString(3, desc);
			ps.setInt(4, price);
			ps.setString(5, img);
			ps.executeUpdate();
			status = "Success";
			
			System.out.print("done");
			}
			catch(Exception e) {
				status = "falied";
				e.printStackTrace();
				System.out.print("not done");
			}
			finally {
	return status;
			}
		
		
	}
	
}
	
