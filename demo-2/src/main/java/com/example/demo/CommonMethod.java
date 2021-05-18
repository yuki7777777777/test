package com.example.demo;

public class CommonMethod {

	public static String  keisan (String a) {
		
		int num = Integer.parseInt(a);
		num = num + 1000;		
		
		return String.valueOf(num);
		
	}
	
}
