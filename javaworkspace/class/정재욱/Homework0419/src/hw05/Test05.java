package hw05;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=1, total=0, x=3;
		
		
		System.out.print("사용자 입력 : ");
		int num = sc.nextInt();
		
		do{
			count++;
			total += x;
			x+=3;
			
		}while(x<=num);
		
		System.out.println(num +"을 넘었을 때의 값 : " + x);
		System.out.println(num +"을 넘었을 때까지의 총합계 : " + total);
		System.out.println(num +"을 넘었을 때까지 몇 번째 3의 배수인가 : " + count);
	}

}
