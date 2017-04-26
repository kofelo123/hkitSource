package Test4;

import java.util.Scanner;

public class TestWage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int segum = 0, wage = 0;
		
		System.out.print("직급 : ");
		int rank = sc.nextInt();
		System.out.print("본봉 : ");
		int money = sc.nextInt();
		
		switch(rank) {
		case 5: case 6:
			segum = (int) (money*0.12);
			wage = money - segum;
			System.out.println("실수령액(세금12프로적용) : " + wage);
			break;
		case 7: case 8:
			segum = (int) (money*0.08);
			wage = money - segum;
			System.out.println("실수령액(세금8프로적용) : " + wage);
		}
		
	}

}
