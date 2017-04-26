package kr.hkit.chap5;

import java.util.Scanner;

public class TestCircle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double r, a, b;
		final double PI = 3.14;
		
		System.out.print("반지름을 입력 : ");
		r = scanner.nextDouble();
		
		a = 2 * PI * r; // 둘레
		b = PI*r*r;//넓이

		System.out.println("둘레는 : "+a);
		System.out.println("넓이는: " + b);
	}
}
