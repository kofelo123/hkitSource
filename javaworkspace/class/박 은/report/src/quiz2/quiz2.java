package quiz2;

import java.util.Scanner;

public class quiz2{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a , b;
		System.out.println("두개의 숫자를 입력하세요.");
		a= sc.nextInt();
		b= sc.nextInt();
		if(a%2==0&b%2==0 || a%2==1&b%2==1){
		
		System.out.println("두 숫자는 같은 짝수 또는 홀수입니다.");
		}
		else
			System.out.println("두 숫자는 같은 짝수 또는 홀수가 아닙니다.");
			

	}

}
