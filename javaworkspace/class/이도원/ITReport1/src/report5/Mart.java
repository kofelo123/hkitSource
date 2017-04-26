package report5;

import java.util.Scanner;

public class Mart {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int product_price, purchase_time;
		int correct_price=0;
		
		System.out.println("구입한 물건의 가격을 입력해 주세요.");
		System.out.print("==> ");
		product_price = scan.nextInt();
		
		System.out.println("구입한 시간을 입력해 주세요.");
		System.out.print("==> ");
		purchase_time = scan.nextInt();
		
		if(purchase_time >= 1 && purchase_time < 12){
			correct_price = product_price - (product_price*5/100);
			
		}
		else if(purchase_time >= 12 && purchase_time < 24){
			correct_price = product_price - (product_price*25/1000);
		}
		else {
			System.out.println("시간을 잘못 입력 하셨습니다.");
		}
		
		System.out.println("\n구입 시간 : " + purchase_time + "시");
		System.out.println("총구 입금액 : " + product_price);
		System.out.println("실제 지불 금액 : " + correct_price);
		
	}

}
