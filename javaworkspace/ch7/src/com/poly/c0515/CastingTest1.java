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
		System.out.println("����̺�(����Ŭ�����޼ҵ�1)");
	}
	
	void stop(){
		System.out.println("��ž(����Ŭ�����޼ҵ�2)");
	}
}

class FireEngine extends Car{
	void water(){
		System.out.println("���Ѹ���(����Ŭ���� ���� �޼ҵ�)");
	}
}