package hw05;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=1, total=0, x=3;
		
		
		System.out.print("����� �Է� : ");
		int num = sc.nextInt();
		
		do{
			count++;
			total += x;
			x+=3;
			
		}while(x<=num);
		
		System.out.println(num +"�� �Ѿ��� ���� �� : " + x);
		System.out.println(num +"�� �Ѿ��� �������� ���հ� : " + total);
		System.out.println(num +"�� �Ѿ��� ������ �� ��° 3�� ����ΰ� : " + count);
	}

}
