package quiz5;

import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int clock, discount, won ; 
		System.out.print("���� �ð�: ");
		clock = sc.nextInt();
		if(0<=clock&clock<12){
			System.out.print("�ѱ� �Աݾ�:");
			won = sc.nextInt();
			discount = won-(won/100*5);
			System.out.print("���� ���� �ݾ� :" +discount);}

		else if(12<=clock&clock<24){
				System.out.print("�ѱ� �Աݾ�:");
				won = sc.nextInt();
				discount = won-(won/40);
				System.out.println("���� ���� �ݾ� :" +discount);
		}
	}

}
