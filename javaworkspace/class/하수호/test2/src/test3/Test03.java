package test3;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total=0, count=0,num=0, i=1;
		double avg=0;
		
		do{
			System.out.println("숫자를 입력하세요 : ");
			num = sc.nextInt();
			if(num>0) {
				total = total+num;
				count++;
			}
			i++;
		}while(i<=10);
		
		avg = (double) total/count;
		
		System.out.println("0보다 큰 수의 총합 : "+total+"\n0보다 큰 수의 평균 : "+avg);
				
	}

}
