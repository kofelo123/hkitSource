package kr.hkit.Prob;

import java.util.Scanner;

public class ThirdProb {

	private int numb;
	
	public ThirdProb() {
		input();
		print();
	}
	
	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		numb=scanner.nextInt();
	}
	
	public void print(){
		int count=numb;
		for(int i=1; i<=numb; i++){
			
			
			for(int j=count; j>=1; j--){
				System.out.print("*");
			}			
			System.out.println();
			count--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThirdProb thirdProb = new ThirdProb();
	}

}
