package com.prob.array2;

public class Prob5_6 {

	public static void main(String[] args) {
		
		int[] coinUnit = {500, 100 ,50, 10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length;i++){
			System.out.println(coinUnit[i]+"��:"+money/coinUnit[i]);
			money-=(money/coinUnit[i])*coinUnit[i];
		}
		
	}
}