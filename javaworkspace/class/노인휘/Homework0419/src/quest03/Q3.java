package quest03;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num=0;
		int sum=0;
		int avg=0;
		int i=0;
		int count=0;
		
		do{
			System.out.println("10개의 숫자를 입력하세요.");
			num=scan.nextInt();
			if(num>0){
				sum+=num;
				count++;
			}
			i++;
		}while(i<=9);
		
		avg=sum/count;
		
		System.out.println("입력받은 수 중 0보다 큰 수의 합 :"+sum);
		System.out.println("입력받은 수 중 0보다 큰 수의 평균 :"+avg);
	}

}
