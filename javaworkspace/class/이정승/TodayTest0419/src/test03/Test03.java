package test03;

import java.util.Scanner;

public class Test03 {
	public static void main(String args[]) {
		//10���� ����, 0���� ū ���� ���ؼ��� ��ü �հ� ����� ����ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		int sum, num, i;
		double avg;
		
		
		num=0;
		sum=0;
		i=0;
		do{
			System.out.println("���ڸ� �Է��ϼ��� �� 10�� �Է� �����Դϴ�.");
			
			num = sc.nextInt();
			if(num > 0){
				sum = sum + num;
				i++;
			}
		}while(i<10);
		
		avg = sum / i;
		
		System.out.println("���� : " + sum + " ����� : " + avg);
		//�� : sum
		//��� : sum/i		
		
	}
}
