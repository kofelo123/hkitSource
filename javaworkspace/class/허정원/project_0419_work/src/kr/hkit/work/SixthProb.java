package kr.hkit.work;

import java.util.Scanner;

public class SixthProb {
	private int numb;
	
	public SixthProb() {
		input();
		cal();
	}
	
	public void input(){
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("사용자입력 : ");
		numb=scanner.nextInt();
		
	}
	
	public void cal(){
		System.out.println("** "+numb+"단"+" **");
		for(int i=8;i>=2;i-=2){
			System.out.println(i+" * "+numb+" = "+i*numb);
		}
		
	}
	
	public static void main(String[] args) {
		SixthProb sixthProb = new SixthProb();
	}

}
