package Test5;

import java.util.Scanner;

public class TestSale {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ð� : ");
		int time = sc.nextInt();
		System.out.print("�� ���Աݾ� : ");
		int buy = sc.nextInt();
		
		if(time<12) {
			buy = (int) (buy * 0.95);
		} else if(time>12 && time<=24) {
			buy = (int) (buy * 0.975);
		}
		
		System.out.print("���� ���� �ݾ� : " + buy);
	}

}
