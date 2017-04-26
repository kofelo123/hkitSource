package test05;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args){
		//3부터 3의 배수 더하기 , num까지의 3의 배수 합
		//숫자입력
		//3의 배수의 총합이 입력된 솟자를 넘었을때, 배수 값과, 총 합계, N값이 몇번째인지를 do while 이용
		
	Scanner sc  = new Scanner(System.in);
		
		int num =0, sum = 0, i = 0, count = 0;
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		do{
			
			if(i%3 == 0){
				if(i > num){
					break;
				}
				sum = sum + i;
				count++;
				System.out.println("현재 i의 값 : " + i);
				
			}
			i++;
	
		}while(true);
		
		System.out.println(num + "을 넘었을때의 값 : " + i);
		System.out.println(num + "을 넘었을때의 총 합계 : " + sum);
		System.out.println(num + "을 넘었을때 몇 번째 3의 배수인가 : " + count);
		
		
	}
}
