package kr.hkit.Prob2;

import java.util.Scanner;

public class Prob4_14 {
	
	public static void main(String[] args) {
		
		int answer=(int)(Math.random()*101) ;//1~100 임의의 값을 얻어서넣음
		int input=0,count=0;//입력,카운트
		
		Scanner scanner = new Scanner(System.in);
		
		do{
			count++;
			
			if(input==answer)//do while로 인해 1회더 묻게되는것 막음.
				break;
			
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = scanner.nextInt();
			
			if(input==answer){
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 "+count+"번입니다.");
			}else{
				if(input>answer)
					System.out.println("더 작은수를 입력해주세요.");
				else
					System.out.println("더 큰수를 입력해주세요.");
			}
			
		}while(true);
		
	}
}
