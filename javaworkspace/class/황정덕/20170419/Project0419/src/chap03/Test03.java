package chap03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=1,b=0;
		int sum=0;
		int count=0;
		double avg=0;
		do{
			System.out.print(a+"���� ���ڸ� �Է� : ");
			b=in.nextInt();
			if(b>0){
				sum=sum+b;
				count++;
			}
			a++;
		}while(a<11);
		avg=sum/count;
		System.out.print("���� : "+sum);
		System.out.print("����� : "+avg);
	}

}
