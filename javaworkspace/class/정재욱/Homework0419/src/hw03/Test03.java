package hw03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total=0, count=0;
		int num=0, x=1;
		double avg=0;
		
		do{
			System.out.println("���ڸ� �Է��Ͻÿ� : ");
			num = sc.nextInt();
			if(num>0) {
				total = total+num;
				count++;
			}
			x++;
		}while(x<=10);
		
		avg = (double) total/count;
		
		System.out.println("0���� ū ���� ���� : "+total+"\n0���� ū ���� ��� : "+avg);
		
		
		
	}

}
