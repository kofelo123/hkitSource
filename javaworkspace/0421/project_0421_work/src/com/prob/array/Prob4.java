package com.prob.array;

public class Prob4 {

	public static void main(String[] args) {
		int [][]a={
				{7,9,4,7,2},
				{3,4,6,7,2}
		};
		int [][]b={
				{3,1,4,8,0},
				{3,5,6,9,1}
		};
		int [][]total={
				{0,0,0,0,0},
				{0,0,0,0,0}
		};
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				total[i][j]=a[i][j]+b[i][j];
				System.out.print(total[i][j]+", ");
			}
			System.out.println();
			
		}
		
		
	}
}
