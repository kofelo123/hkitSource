package quest02;

public class Q2 {

	public static void main(String[] args) {

		int num = 100;
		int total = 0;

		do {

			if (num % 2 == 1) {
				total += num;
			}
			num--;

		} while (num >= 1);
		System.out.println("100부터 1까지의 수 중 홀수의 합 : " + total);
	}

}
