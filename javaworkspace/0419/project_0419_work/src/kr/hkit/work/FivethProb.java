package kr.hkit.work;

import java.util.Scanner;

public class FivethProb {
	private int numb;
	
	public FivethProb() {
		input();
		cal();
	}
	
	public void input(){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("사용자입력:");
		numb=scanner.nextInt();
	}
	public void cal(){
		
		int i=0,three=0,sum=0;
		
		do{		
			i++;
			three=3*i;
			if(three<numb)
			sum+=three;
						
		}while(three<numb);
		
		System.out.println(numb+"을 넘었을 떄의 값:"+three);
		System.out.println(numb+"을 넘었을 때까지의 총합계:"+sum);
		System.out.println(numb+"을 넘었을 때까지 몇 번쨰 3의 배수인가 : "+i);
	}
	
	

	public static void main(String[] args) {
		FivethProb fivethProb = new FivethProb();
	}

}
