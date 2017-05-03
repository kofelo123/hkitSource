package com.jeongwon.chap2;

import java.util.Scanner;

public class Ex3_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num,sum=0,per=0,i=10;
		System.out.print("숫자입력:");
		num=scanner.nextInt();
		
		while(num==0){
			
			per+=(num%i)/(i/10);
			num-=per;
			sum+=per;
			
		
			i=i*10;
		}
		System.out.println(sum);
		
	}
}
