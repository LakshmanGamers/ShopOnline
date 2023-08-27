package com.shopNest.customer;

import com.shopNest.dbHandler.*;
public class Validator {

	public static boolean isValid(String user,String pass) {
		
		String dbPass = DataFetcher.fetchPassword(user);
		System.out.print(pass.equals(dbPass));
		System.out.println(pass+" "+dbPass+" "+user);
		if(pass.equals(dbPass)) {
			return true;
		}
		else {
			return false;
		}
	}
}
