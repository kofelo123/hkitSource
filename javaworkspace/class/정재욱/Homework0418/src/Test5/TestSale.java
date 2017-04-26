package Test5;

import java.util.Scanner;

public class TestSale {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구입 시간 : ");
		int time = sc.nextInt();
		System.out.print("총 구입금액 : ");
		int buy = sc.nextInt();
		
		if(time<12) {
			buy = (int) (buy * 0.95);
		} else if(time>12 && time<=24) {
			buy = (int) (buy * 0.975);
		}
		
		System.out.print("실제 지불 금액 : " + buy);
	}

}
