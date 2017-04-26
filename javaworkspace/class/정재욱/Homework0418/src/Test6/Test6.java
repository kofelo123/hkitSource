package Test6;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		int wage = 0, standard=40;

		Scanner sc = new Scanner(System.in);

		System.out.print("직급 : ");
		int rank = sc.nextInt();
		System.out.print("근무 시간 : ");
		int work = sc.nextInt();

		switch (rank) {
		case 7:
		case 8:
			if (work > standard) {
				work = work - standard;
				wage = (int) (work * 15000 * 1.5 + standard * 15000);
			} else {
				wage = standard * 15000;
			}
			break;
		case 5:
		case 6:
			if (work > standard) {
				work = work - standard;
				wage = (int) (work * 20000 * 1.5 + standard * 20000);
			} else {
				wage = standard * 20000;
			}
			break;
		}
		System.out.print("주 급여 : " + wage);
	}

}
