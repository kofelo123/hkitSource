package kr.hkit.chap6;

import java.util.Scanner;

public class TestIf2 {
	Scanner scanner = new Scanner(System.in);
	int score;

	public void ifTest() {
		while(true){
			
		System.out.print("점수입력:");
		score = scanner.nextInt();

		if (score >= 90) {
			System.out.println("90~100 등급:A");
		} else if (score >= 80) {
			System.out.println("89~80 등급:B");
		} else if (score >= 70) {
			System.out.println("79~70 등급:C");
		} else if (score >= 60) {
			System.out.println("69~60 등급:D");
		} else {
			System.out.println("60점미만 등급:F");
		}
			System.out.println("-------------");
		}
		//score < 70 && score >= 60 x
		
		/*
		
		if(score>=60){
			if(score >=70){
				if(score >=80){
					if(score >=90){
						System.out.println("A학점이다.");
					}else{
						System.out.println("B학점이다.");
					}
				}else{
					System.out.println("C학점..");
					
					...
					
					중첩if사용 
					결과는 같으나 코드길이 길어진다.
		
		
		*/
		
	}

	public static void main(String[] args) {

		TestIf2 testIf2 = new TestIf2();
		
		testIf2.ifTest();
		
	}
}
