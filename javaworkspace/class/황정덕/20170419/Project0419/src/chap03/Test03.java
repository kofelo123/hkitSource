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
			System.out.print(a+"번쨰 숫자를 입력 : ");
			b=in.nextInt();
			if(b>0){
				sum=sum+b;
				count++;
			}
			a++;
		}while(a<11);
		avg=sum/count;
		System.out.print("합은 : "+sum);
		System.out.print("평균은 : "+avg);
	}

}
