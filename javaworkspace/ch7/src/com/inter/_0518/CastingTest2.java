package com.inter._0518;

public class CastingTest2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		
		if(fe instanceof Car){
			fe = (FireEngine)car;
			
		}else{
			car= new FireEngine();
			fe = (FireEngine)car;
			
		}
		fe.drive();
		car2 = fe;
		car2.drive();
	}
	

}

class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("drive, Brrrr~");
	}
	void stop(){
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car{
	void water(){
		System.out.println("water!!!");
	}
}
