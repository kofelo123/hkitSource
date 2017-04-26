package test04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// 1부터 100까지의 합을 10의 배수 만큼 끊어서 찍어내기

	Scanner sc  = new Scanner(System.in);
		
		int num =0, sum = 0, i = 1;
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		do{
			sum = sum + i;
			i++;
	//		System.out.println("sum은" + sum);
			
			if(i%10 == 0){
				System.out.println("1부터 - " + i +" : " + sum);
			}
			
		}while(i <= num);
		
		System.out.println("1부터 " + num + "까지의 합은" + sum +"입니다");
		
	}

}
