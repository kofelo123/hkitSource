package test05;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//물건값과 구입시간 입려, 실제지불한 금액을 출력
		//구입 금액의5% 할인
		//구입 금액의 2.5%할인
		
		
		int time;
		double price, pay;
		
		System.out.println("구입시간 : ");
		time = sc.nextInt();
		
		System.out.println("총 구입금액 : ");
		price = sc.nextInt();
		
		if(time >= 12){
			pay = price - price*0.025;
		}
		else
			pay = price - price*0.05;
		
		System.out.println("실제 지불 금액 : " + pay);
		
	}

}
