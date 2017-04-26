package quest6;

import java.util.Scanner;

public class Pay2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int rank = 0;
		int work_time = 0;
		int after_pay = 0;

		System.out.println("직급을 입력하세요");
		rank = scan.nextInt();
		System.out.println("근무시간을 입력하세요");
		work_time = scan.nextInt();

		if (rank == 7 || rank == 8) {
			if (work_time > 40) {
				after_pay = (40 * 15000) + (22500 * (work_time - 40));
			} else
				after_pay = 40 * 15000;
		}

		else if (rank == 5 || rank == 6) {
			if (work_time > 40) {
				after_pay = (40 * 20000) + (30000 * (work_time - 40));
			} else
				after_pay = 40 * 20000;
		}
					
		System.out.println("직급 : " + rank + "급");
		System.out.println("근무시간 : " + work_time + "시간");
		System.out.println("주 급여 : " + after_pay);

	}
}
