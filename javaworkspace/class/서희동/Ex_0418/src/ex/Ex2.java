package ex;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 수");
		a = sc.nextInt();
		System.out.println("두번째 수");
		b = sc.nextInt();
		if(a%2==0 && b%2==0){
			System.out.println("두 숫자는 모두 짝수 입니다.");
		}else if(a%2==1 && b%2==1){
			System.out.println("두 숫자는 모두 홀수 입니다.");
		}else{
			System.out.println("하나는 짝수 하나는 홀수 입니다.");
		}
	}

}
