package com.prob.array2;

public class Prob5_7 {
	public static void main(String[] args) {
		
		if(args.length!=1){
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10};
		int[] coin = {5, 5, 5, 5};
		
		for(int i=0; i<coinUnit.length;i++){
			int coinNum = 0;
			//
			System.out.println(coinUnit[i]+"��: " +coinNum);
		}
		
		if(money > 0){
			System.out.println("�Ž��� ���� �����մϴ�.");
			System.exit(0);
		}
		System.out.println("=���� ������ ���� = ");
		
		for(int i=0;i<coinUnit.length;i++){
			System.out.println(coinUnit[i]+"��:"+coin[i]);			
		}
	}
}