package com.prob.array;

public class Prob3 {
	public static void main(String[] args) {
		
		int count=0;
		int[][] num={
					{7,9,4,7,2},
					{3,4,6,7,2},
					{3,2,6,9,8},
		};
		
		for(int i=1;i<10;i++){ //��
			for(int j=0;j<num.length;j++){//��
				for(int k=0;k<num[j].length;k++){ // ��
					
					if(num[j][k]==i)
						count++;
					
					
				}
			}
			if(count!=0)
				System.out.println(i+"�� ���� : "+ count);
			count=0;
		}
	}
}