package kr.hkit.Prob;

import java.util.Scanner;

public class SecondProb {
	Scanner scanner = new Scanner(System.in);
	private int numb;
	
	public SecondProb() {
		input();
		print();
	}
	public void input(){
		System.out.print("숫자를 입력해주세요: ");
		numb=scanner.nextInt();
	}
	public void print(){
		int upnumb=1;
		for(int i=1;i<=numb;i++){
			
			for(int j=1;j<=numb;j++){
				System.out.print(upnumb);
				upnumb++;
			}
			System.out.println();
		}
			
			System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecondProb secondProb = new SecondProb();
		
	}

}
