package hw07;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total=0, count=0;
		
		do{
			System.out.print("������ �Է��ϼ��� : ");
			int num = sc.nextInt();
			count++;
			
			if(count%2==0) {
				num *= -1;
			} 
			total += num;
			
		}while(count<10);
		System.out.println(count + "���� ���� ������ : " + total);
	}

}
