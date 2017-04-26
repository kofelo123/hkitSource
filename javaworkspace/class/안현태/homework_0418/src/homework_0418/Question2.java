package homework_0418;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오:");
		a=sc.nextInt();
		
		System.out.println("숫자를 입력하시오:");
		b=sc.nextInt();
		
		if( ((a%2==0) && (b%2==0)) || ((a%2!=0) && (b%2!=0)) ){
			System.out.println("두 숫자는 같은 짝수 또는 홀수입니다");
		}
		else
			System.out.println("두 숫자는 다릅니다");
	}

}
