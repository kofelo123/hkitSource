package com.oop.oop_0508;

public class TestMethod {
	
	public static void greet(int age){
		
		System.out.println("Good Morning");
		System.out.println("���� "+age+"�� �Դϴ�.");
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Start");
		TestMethod.greet(12);
		TestMethod.greet(29);
		TestMethod.greet(40);
		System.out.println("End");
	}

}
