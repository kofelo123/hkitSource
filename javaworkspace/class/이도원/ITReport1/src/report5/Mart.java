package report5;

import java.util.Scanner;

public class Mart {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int product_price, purchase_time;
		int correct_price=0;
		
		System.out.println("������ ������ ������ �Է��� �ּ���.");
		System.out.print("==> ");
		product_price = scan.nextInt();
		
		System.out.println("������ �ð��� �Է��� �ּ���.");
		System.out.print("==> ");
		purchase_time = scan.nextInt();
		
		if(purchase_time >= 1 && purchase_time < 12){
			correct_price = product_price - (product_price*5/100);
			
		}
		else if(purchase_time >= 12 && purchase_time < 24){
			correct_price = product_price - (product_price*25/1000);
		}
		else {
			System.out.println("�ð��� �߸� �Է� �ϼ̽��ϴ�.");
		}
		
		System.out.println("\n���� �ð� : " + purchase_time + "��");
		System.out.println("�ѱ� �Աݾ� : " + product_price);
		System.out.println("���� ���� �ݾ� : " + correct_price);
		
	}

}
