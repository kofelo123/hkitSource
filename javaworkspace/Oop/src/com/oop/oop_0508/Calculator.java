package com.oop.oop_0508;

class Four implements Intertest{

	
	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.print(a+b);
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.print(a-b);
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.print(a*b);
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.print(a/b);
	}
	
}

public class Calculator {

	
public Calculator(Intertest di) {
		
	}
	
	public static void main(String[] args) {
		Intertest intertest ;
	
		Calculator cal = new Calculator(intertest);
		
		System.out.print("´õÇÏ±â:");cal.add(10,6);
		System.out.print("\n»¬¼À:");cal.sub(10,6);
		System.out.print("\n°öÇÏ±â:");cal.mul(10,6);
		System.out.print("\n³ª´©±â:");cal.div(10,6);
		
	}
}
