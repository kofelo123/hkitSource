package quest07;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=0;
		int i=0; //짝수번째 확인
		int total=0;
		int count=1;
		
		do{
			System.out.println("10개의 정수를 입력하세요.");
			num=scan.nextInt();
			
			if(count%2==0)
			{
				num=num*(-1);
			}
			count++;
			total+=num;
			i++;
			
		}while(i<=9);
		
		System.out.println("총합 : "+ total);
	}

}
