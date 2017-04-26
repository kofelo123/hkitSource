package kr.hkit.chap2;

import java.util.Scanner;

public class test3 {
	
	public void sumavg(){
		
		int[] score = new int[3];	
		int sum=0;
		Scanner scanner = new Scanner(System.in);

		for(int i=0;i<score.length;i++){
			if(i==0){
				System.out.println("한국어 점수는?");
				score[i]=scanner.nextInt();
				sum+=score[i];
			}else if(i==1){
				System.out.println("영어 점수는?");
				score[i]=scanner.nextInt();
				sum+=score[i];
			}else{
				System.out.println("수학 점수는?");
				score[i]=scanner.nextInt();
				sum+=score[i];
				
			}
	
		
			
		}
		System.out.println("총점은="+sum);
		System.out.println("평균은="+sum/3);
	}
	
public static void main(String[] args) {
	
	test3 test = new test3();
	test.sumavg();
	
	}
}
