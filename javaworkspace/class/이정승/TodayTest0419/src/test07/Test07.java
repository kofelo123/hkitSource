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
			System.out.println("���ڸ� �Է��ϼ��� �� 10�� �Է� �����Դϴ�.");
			
			num = sc.nextInt();
			if(i%2 == 0){
					num = num*(-1);
			}
			sum = sum + num;
			i++;
		}while(i<10);
		
		
		System.out.println("10���� ������ ���� " + sum );
	}

}
