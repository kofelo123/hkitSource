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
			System.out.println("10���� ���ڸ� �Է��ϼ���.");
			num=scan.nextInt();
			if(num>0){
				sum+=num;
				count++;
			}
			i++;
		}while(i<=9);
		
		avg=sum/count;
		
		System.out.println("�Է¹��� �� �� 0���� ū ���� �� :"+sum);
		System.out.println("�Է¹��� �� �� 0���� ū ���� ��� :"+avg);
	}

}
