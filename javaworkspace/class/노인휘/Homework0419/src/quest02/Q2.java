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
		System.out.println("100���� 1������ �� �� Ȧ���� �� : " + total);
	}

}
