package kr.hkit.chap4;

public class calculator {
	
	
	public static void main(String[] args) {
		double radius,circum,area;//반지름,원둘레,원넓이
		
		final double PI=3.141592;		
		radius=4.5; //반지름
		circum=(radius*2)*PI; //원둘레
		area=(radius*radius)*PI; //원넓이
		
		System.out.println("원둘레 구하기:"+circum);
		System.out.println("원넓이 구하기:"+area);
		
		
	}
}
