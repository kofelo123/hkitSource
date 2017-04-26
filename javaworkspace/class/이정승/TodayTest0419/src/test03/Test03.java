package test03;

import java.util.Scanner;

public class Test03 {
	public static void main(String args[]) {
		//10개의 숫자, 0보다 큰 수에 대해서만 전체 합과 평균을 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int sum, num, i;
		double avg;
		
		
		num=0;
		sum=0;
		i=0;
		do{
			System.out.println("숫자를 입력하세요 총 10번 입력 예정입니다.");
			
			num = sc.nextInt();
			if(num > 0){
				sum = sum + num;
				i++;
			}
		}while(i<10);
		
		avg = sum / i;
		
		System.out.println("합은 : " + sum + " 평균은 : " + avg);
		//합 : sum
		//평균 : sum/i		
		
	}
}
