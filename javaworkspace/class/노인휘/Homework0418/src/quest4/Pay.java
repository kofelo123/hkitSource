package quest4;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int before_pay = 0;
		int rank = 0;
		int after_pay = 0;

		System.out.println("직급을 입력하세요(5~8급)");
		rank = scan.nextInt();

		System.out.println("본봉을 입력하세요");
		before_pay = scan.nextInt();

		if (rank == 7 || rank == 8) {
			after_pay = before_pay * 92 / 100;
			System.out.println("직급 : " + rank);
			System.out.println("본봉 : " + before_pay);
			System.out.println("실수령액(세금8%적용) : " + after_pay);
		} else if (rank == 5 || rank == 6) {
			after_pay = before_pay * 88 / 100;
			System.out.println("직급 : " + rank);
			System.out.println("본봉 : " + before_pay);
			System.out.println("실수령액(세금12%적용) : " + after_pay);
		}
	}
}
