package com.prob.array;

public class Prob3 {
	public static void main(String[] args) {
		
		int count=0;
		int[][] num={
					{7,9,4,7,2},
					{3,4,6,7,2},
					{3,2,6,9,8},
		};
		
		for(int i=1;i<10;i++){ //수
			for(int j=0;j<num.length;j++){//행
				for(int k=0;k<num[j].length;k++){ // 열
					
					if(num[j][k]==i)
						count++;
					
					
				}
			}
			if(count!=0)
				System.out.println(i+"의 개수 : "+ count);
			count=0;
		}
	}
}
