package Homework;

import java.util.Scanner;

public class Study5 {
	public static void main(String[] args){
		int Rank,time,salay;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("직급 입력하세요:");
		Rank = scan.nextInt();
		
		System.out.println("근무시간 입력하세요:");
		time = scan.nextInt();
		
		switch (Rank) {
		case 5:
		case 6://시간당 20000
			salay = time * 15000;
			System.out.println("직급:" +Rank+"급");
			System.out.println("근무시간:" + time +"시간");
			System.out.println("주급여:" + salay);
			
			
			if(time>40){
				salay = (int)(time * 15000 * 1.5);
			}
			else if(time<40){
				salay = time * 15000;
			}
			break;
			
		case 7:
		case 8://시간당 15000
			salay = time * 15000;
			System.out.println("직급:" +Rank+"급");
			System.out.println("근무시간:" + time +"시간");
			System.out.println("주급여:" + salay);
			if(time>40){
				salay = (int)(time * 15000 * 1.5);
			}
			else if(time<40){
				salay = time * 15000;
			}
			break;

		default:
			System.out.println("잘못입력했어요");
			break;
		}
	}
}
