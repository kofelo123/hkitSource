package kr.hkit.array;

import java.util.Scanner;

public class ArrayPrac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] kor={70,80,70,80,80,50,60,70,80,70};
		int sum=0;
		for(int i=0; i<kor.length;i++){//length는 갯수라서 0부터 x
			sum+=kor[i];
			
		}
		System.out.println("총점:"+sum);
		System.out.println("평균:"+sum/kor.length);
		
		
		
		Scanner scanner = new Scanner(System.in);
		int[] input= new int[7];
		int max=0,min=100;
		
		for(int i=0;i<input.length;i++){
			System.out.print("수를 입력해주세요: ");
			input[i]=scanner.nextInt();
			
			if(input[i]>max) //입력된값과 max,min과 비교해서 넣어준다.
				max=input[i];
			if(input[i]<min)
				min=input[i];
			
			
		}
		
		System.out.println("최대값은:"+max);
		System.out.println("최소값은:"+min);
		
		
		
		
	}

}
