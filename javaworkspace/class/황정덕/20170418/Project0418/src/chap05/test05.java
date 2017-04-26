package chap05;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("오전 12시 이전 : 구입 금액의 5%할인");
		System.out.println("오전 12시 이후 : 구입 금액의 2.5%할인");
		System.out.print("구입시간을 입력 : ");
		int timea=in.nextInt();
		System.out.print("총구 입금액 입력 : ");
		int money=in.nextInt();
		
		if(timea<12&&timea>0){
			System.out.println("구입시간 : "+timea+"시");
			System.out.println("총구 입금액 : "+money);
			System.out.println("실제 지불 금액 : "+(money-(money*0.05)));
		}else if(timea>=12&&timea<=24){
			System.out.println("구입시간 : "+timea+"시");
			System.out.println("총구 입금액 : "+money);
			System.out.println("실제 지불 금액 : "+(money-(money*0.025)));
		}else{
			System.out.println("시간을 잘못입력하셨습니다");
		}
	}

}
