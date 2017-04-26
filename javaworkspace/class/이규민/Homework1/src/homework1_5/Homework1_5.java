package homework1_5;

import java.util.*;

public class Homework1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int time, price, real;
		System.out.println("물건값을 입력하시오");
		price = sc.nextInt();
		System.out.println("구입한 시간을 입력하시오.");
		time = sc.nextInt();
		if(time>24){
			System.out.println("시간입력이 잘못되었습니다.");
			return;
		}
		else if(time<12)
			real = (price*95)/100;
		else
			real = (price*975)/1000;
		System.out.println("실제 지불 금액  :  "+real);
		
	}

}
