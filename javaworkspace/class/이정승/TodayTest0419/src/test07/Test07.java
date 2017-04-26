package test07;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum, num, i;
		double avg;
		
		
		num=0;
		sum=0;
		i=0;
		do{
			System.out.println("숫자를 입력하세요 총 10번 입력 예정입니다.");
			
			num = sc.nextInt();
			if(i%2 == 0){
					num = num*(-1);
			}
			sum = sum + num;
			i++;
		}while(i<10);
		
		
		System.out.println("10개의 정수의 합은 " + sum );
	}

}
