package com.prob.array;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int[][]num={
				{28,33,36,7},
				{56,66,44,20},
				{88,7,21,44},
				{33,2,643,4}
			};

		for(int i=0;i<num.length;i++){
			for(int j=0;j<num[i].length;j++){
				if(num[i][j]%3==0)
					count++;
			}
		}
		System.out.println("3의 배수는 "+count+"개 입니다.");
		
	}

}
