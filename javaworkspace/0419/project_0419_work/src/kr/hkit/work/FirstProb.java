package kr.hkit.work;

import java.util.Scanner;

public class FirstProb {
		
	private int numb;
	
	public FirstProb() {
	
	}
	
	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		numb=scanner.nextInt();
	}
	
	public void sum(){
		int total=0;
		while(numb>=1){
			total+=numb;
			numb--;
		}
		System.out.println(total);
	}
	
	
	
	public static void main(String[] args) {
		FirstProb firstProb = new FirstProb();
		firstProb.input();
		firstProb.sum();
	}

}
