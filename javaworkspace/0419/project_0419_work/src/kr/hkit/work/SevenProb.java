package kr.hkit.work;

import java.util.Scanner;

public class SevenProb {
	private int numb;

	public SevenProb() {
		cal();
	}
	
	public void cal(){
		Scanner scanner = new Scanner(System.in);
		int i=1,sum=0;
		do{
			System.out.print("���ڸ� �Է��ϼ���:");
			numb=scanner.nextInt();
			if(numb%2==0)
			sum+=numb;
			else
			sum=sum-numb;
			i++;
		}while(i<=10);
		
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		SevenProb sevenProb = new SevenProb();
	}

}
