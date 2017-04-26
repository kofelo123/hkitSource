package homework1_6;

import java.util.*;

public class Homework1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int time, overtime = 0, money, rank, time_money;
		
		System.out.println("직급을 입력하시오.");
		rank = sc.nextInt();
		System.out.println("근무시간을 입력하시오.");
		time = sc.nextInt();
		
		switch(rank){
		case 5:
		case 6:
			time_money = 20000;
			break;
		case 7:
		case 8:
			time_money = 15000;
			break;
		default:
			System.out.println("직급입력이 잘못되었습니다.");
			return;
				
		}
		
		if(time > 40)
			overtime = time - 40;
		
		money = time_money*40 + (time_money*15*overtime)/10;
		System.out.println("주 급엽  :  "+money);
		
	}

}
