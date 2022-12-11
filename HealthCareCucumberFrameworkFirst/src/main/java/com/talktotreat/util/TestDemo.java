package com.talktotreat.util;

import org.testng.annotations.Test;

public class TestDemo {

	public static void main(String[] args) {
		
		
			// config ---url
			String saveUrl = PropertyReader.getConfigProperty("url");
			System.out.println("url  --->" + saveUrl);

			String saveEmail = PropertyReader.getDataProperty("email");
		System.out.println("email is  :" +saveEmail);
	
			//String databaseP = PropertyReader.getDataBaseCon("email");
			//System.out.println("password is " + databasePAssword);
	
			String password = PropertyReader.getDataBaseCon("password");
			System.out.println("host " + password);

		
		
	}

}
