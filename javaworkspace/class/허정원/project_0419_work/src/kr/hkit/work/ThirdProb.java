package kr.hkit.work;

import java.util.Scanner;

public class ThirdProb {
	
	private int numb=0;
	
	
	public ThirdProb() {
		
	inputCal();
		
	}
	
	public void inputCal(){
		Scanner scanner = new Scanner(System.in);
		int sum=0,avg=0,count=0,i=1;
				
		do{
			System.out.println("숫자 10개를 입력하세요:");
			numb=scanner.nextInt();
			if(numb>0){
				sum+=numb;	
				count++;
			}
			i++;
		}while(i<11);
		avg=sum/count;
		System.out.println("sum="+sum+",avg="+avg);
		
	}
	
	
	public static void main(String[] args) {
		
	ThirdProb thirdProb = new ThirdProb();	
	

	}

}
