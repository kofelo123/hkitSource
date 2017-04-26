package quest5;

import java.util.Scanner;

public class Sale {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int time = 0;
		int input = 0;
		int output = 0;

		System.out.println("구입시간을 입력하세요 (0 ~ 24)");
		time = scan.nextInt();
		System.out.println("구입한 물건 값을 입력하세요");
		input = scan.nextInt();

		if (time < 12 && time >= 0) {
			output = input * 95 / 100;
		} else if (time >= 12 && time < 24) {
			output = input * 975 / 1000;
		}

		System.out.println("구입시간 : " + time + "시");
		System.out.println("총 구입금액 : " + input);
		System.out.println("실제 지불 금액 : " + output);

	}

}
