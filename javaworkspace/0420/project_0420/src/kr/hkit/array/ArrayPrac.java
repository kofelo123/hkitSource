package kr.hkit.array;

public class ArrayPrac {

	public static void main(String[] args) {
		int[] score = new int[5];
		int hap = 0;
		score[0] = 50;
		score[1] = 60;
		score[2] = 70;
		score[3] = 30;
		score[4] = 90;

		
		double[] height = {171.5,190.2,185.5,159.4,148.7,140};
		
		System.out.println("키배열의 크기는: "+ height.length);
		
		
//		hap = score[0]+score[1]+score[2]+score[3]+score[4];
		
		
		
		for(int i=0; i<score.length; i++){
			if(i%2==1)
			hap +=score[i];
		}
		
		
		System.out.println("총합은 : " + hap);
	}

}
