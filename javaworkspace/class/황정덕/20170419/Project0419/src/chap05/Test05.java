package chap05;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=1,b=3;
		int sum=0;
		int c=0;
		int count=0;
		System.out.print("사용자 입력 : ");
		a=in.nextInt();
		do{
			sum=sum+b;
			b=b+3;
			count++;
		}while(b<a);
		System.out.println(a+"을 넘었을 때의 값 : "+b);
		System.out.println(a+"을 넘었을 떄까지의 총합계 : "+sum);
		System.out.println(a+"을 넘었을 때까지 몇 번재 3의 배수인가 : "+(count+1));
	}

}
