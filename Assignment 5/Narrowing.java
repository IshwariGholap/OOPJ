package com.example;

public class Narrowing {

	public static void main(String[] args) {
		double d1 = 23.10d;
		
		char ch = (char)d1;
		System.out.println(ch);
		
		byte b1 = (byte)d1;
		System.out.println(d1);
		
		short s1 = (short)d1;
		System.out.println(s1);
	}

}
