package kr.hkit.chap6;

import java.util.Scanner;

public class TestIf2 {
	Scanner scanner = new Scanner(System.in);
	int score;

	public void ifTest() {
		while(true){
			
		System.out.print("�����Է�:");
		score = scanner.nextInt();

		if (score >= 90) {
			System.out.println("90~100 ���:A");
		} else if (score >= 80) {
			System.out.println("89~80 ���:B");
		} else if (score >= 70) {
			System.out.println("79~70 ���:C");
		} else if (score >= 60) {
			System.out.println("69~60 ���:D");
		} else {
			System.out.println("60���̸� ���:F");
		}
			System.out.println("-------------");
		}
		//score < 70 && score >= 60 x
		
		/*
		
		if(score>=60){
			if(score >=70){
				if(score >=80){
					if(score >=90){
						System.out.println("A�����̴�.");
					}else{
						System.out.println("B�����̴�.");
					}
				}else{
					System.out.println("C����..");
					
					...
					
					��øif��� 
					����� ������ �ڵ���� �������.
		
		
		*/
		
	}

	public static void main(String[] args) {

		TestIf2 testIf2 = new TestIf2();
		
		testIf2.ifTest();
		
	}
}
