package kr.hkit.chap5;

import java.util.Scanner;

public class TestCircle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double r, a, b;
		final double PI = 3.14;
		
		System.out.print("�������� �Է� : ");
		r = scanner.nextDouble();
		
		a = 2 * PI * r; // �ѷ�
		b = PI*r*r;//����

		System.out.println("�ѷ��� : "+a);
		System.out.println("���̴�: " + b);
	}
}
