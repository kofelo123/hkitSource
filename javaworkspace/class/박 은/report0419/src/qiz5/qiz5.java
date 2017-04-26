package qiz5;

import java.util.Scanner;

public class qiz5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		int a=0;
		int sum=0;
		int b=0;
		System.out.println("사용자 입력:");
		n= sc.nextInt();
		do{
			sum=sum+a;
			a=a+3;
			b++;
			if(a>n){
			System.out.println(n+"을 넘었을 때의 합:"+a);	
			}
			}while(a<n);
		System.out.println(n+"을 넘었을 떄까지의 총합계:"+sum);
		System.out.println(n+"을 넘었을 때까지 몇 번쨰 3의 배수인가:"+b);

	}
	

}
