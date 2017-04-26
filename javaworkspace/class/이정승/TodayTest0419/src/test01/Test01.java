package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//숫자 입력 후 1부터 그 숫자까지 합을 구하라
	
		Scanner sc  = new Scanner(System.in);
		
		int num =0, sum = 0, i = 1;
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		do{
			sum = sum + i;
			i++;
	//		System.out.println("sum은" + sum);
			
		}while(i <= num);
		
		System.out.println(num + "까지의 합은" + sum +"입니다");
	
	}

}
