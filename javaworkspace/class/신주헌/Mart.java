package Homework;

import java.util.Scanner;

public class Mart {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int time,price,totalprice;
		
		System.out.print("시간대 입력하세요");
		time = scan.nextInt();
		System.out.print("물건가격 입력하세요:");
		price = scan.nextInt();
		
		if(time<12){
			totalprice = (int)(price-(price*0.05));
			System.out.println("구입시간:" +time);
			System.out.println("총구입금액:" + price);
			System.out.println("실제 지불 금액:" +totalprice);
			
		}else if(time>=12){
			totalprice = (int)(price-(price*2.5));
			System.out.println("구입시간:" +time);
			System.out.println("총구입금액:" + price);
			System.out.println("실제 지불 금액:" +totalprice);
		}
		
		
	}
}
