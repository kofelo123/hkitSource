package com.poly.c0515;

public class CastingTest1 {

	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car =fe;
		car.water();
		fe2 = (FireEngine) car;
		fe2.water();
	}
}


class Car{
	String color; 
	int door;
	
	void drive(){
		System.out.println("드라이브(슈퍼클래스메소드1)");
	}
	
	void stop(){
		System.out.println("스탑(슈퍼클래스메소드2)");
	}
}

class FireEngine extends Car{
	void water(){
		System.out.println("물뿌리기(서브클래스 고유 메소드)");
	}
}