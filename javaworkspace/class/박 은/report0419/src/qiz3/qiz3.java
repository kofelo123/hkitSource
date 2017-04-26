package qiz3;

import java.util.Scanner;

public class qiz3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, sum=0,averge, n=0;
		System.out.println("10개의 숫자를 입력하세요.");
		do{
			a=sc.nextInt();
			if(a>0){ sum=sum+a;
			n++;				
			}else {
				System.out.println("0보다 작습니다.");
			}
				}while(n<10);
		averge= sum/n;
		System.out.println("10개의숫자합:"+sum);
		System.out.println("10개의숫자 평균:"+averge);
	}

}
