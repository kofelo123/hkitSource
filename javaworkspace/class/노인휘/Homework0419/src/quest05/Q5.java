package quest05;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num=0;
		int a=0;
		int count =0;
		int sum=0;
		
		System.out.println("하나의 숫자를 입력하세요");
		num=scan.nextInt();
		
		do{
			a=a+3;
			count++;
			if(a>num){
				break;
			}
			sum+=a;			

				
		}while(true);
				
		System.out.println("사용자 입력 : "+num);
		System.out.println(num+"을 넘었을 때의 값: "+a );
		System.out.println(num+"을 넘었을 때까지의 총합계: "+sum);
		System.out.println(num+"을 넘었을 때까지 몇 번째 3의 배수인가: "+count);
	}

}
