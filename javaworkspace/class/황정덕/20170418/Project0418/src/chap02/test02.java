package chap02;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		System.out.print("첫번째 숫자 입력 : ");
		a=in.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		b=in.nextInt();
		if((a%2)==0&&(b%2)==0){
			System.out.println("둘다 짞수");
		}else if((a%2)==1&&(b%2)==1){
			System.out.println("둘다 홀수");
		}
		System.out.println("둘다 짝수 또는 둘다 홀수 아님");
	}

}
