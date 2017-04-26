package ex;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		int price;
		int time;
		double sil;  //실 급여
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구입한 시간 : ");
		time = sc.nextInt();
		System.out.println("물건 가격 : ");
		price = sc.nextInt();
		
		if(time<12){
			sil=price-(price*5/100);
			System.out.println("구입 시간 : "+time+"시");
			System.out.println("총 구입 금액 : "+price+"원");
			System.out.println("실제 지불 금액 : "+sil+"원");
		}else{
			sil=price-(price*2.5/100);
			System.out.println("구입 시간 : "+time+"시");
			System.out.println("총 구입 금액 : "+price+"원");
			System.out.println("실제 지불 금액 : "+sil+"원");
		}
	}

}
