package chap07;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=1,b=0;
		int sum=0;
		do{
			System.out.print(a+"번쨰 숫자를 입력 : ");
			b=in.nextInt();
			if((a%2)==0){
				sum=sum-b;
			}else{
				sum=sum+b;
			}
			a++;
		}while(a<11);
		System.out.print("합은 : "+sum);
	}

}
