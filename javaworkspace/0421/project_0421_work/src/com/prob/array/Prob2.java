package com.prob.array;

public class Prob2 {
	
	public static void main(String[] args) {
		
		int sum=0;
		int[][] num={
				{28,33,36,7},
				{56,66,44,20},
				{88,7,21,44},
				{33,2,643,4},
		};
		
		for(int j=0;j<num.length;j++){
			for(int i=0;i<num[j].length;i++){
				sum+=num[i][j];
			}
			System.out.println((j+1)+"���� �հ� : " + sum);
			sum=0;
		}
	}

}
