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
		
		System.out.print("������Է�:");
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
		
		System.out.println(numb+"�� �Ѿ��� ���� ��:"+three);
		System.out.println(numb+"�� �Ѿ��� �������� ���հ�:"+sum);
		System.out.println(numb+"�� �Ѿ��� ������ �� ���� 3�� ����ΰ� : "+i);
	}
	
	

	public static void main(String[] args) {
		FivethProb fivethProb = new FivethProb();
	}

}