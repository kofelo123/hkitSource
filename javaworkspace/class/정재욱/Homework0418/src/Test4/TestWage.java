package Test4;

import java.util.Scanner;

public class TestWage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int segum = 0, wage = 0;
		
		System.out.print("���� : ");
		int rank = sc.nextInt();
		System.out.print("���� : ");
		int money = sc.nextInt();
		
		switch(rank) {
		case 5: case 6:
			segum = (int) (money*0.12);
			wage = money - segum;
			System.out.println("�Ǽ��ɾ�(����12��������) : " + wage);
			break;
		case 7: case 8:
			segum = (int) (money*0.08);
			wage = money - segum;
			System.out.println("�Ǽ��ɾ�(����8��������) : " + wage);
		}
		
	}

}
