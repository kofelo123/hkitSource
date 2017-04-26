package homework1_4;

import java.util.*;

public class Homework1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money, real, tax, rank;
		
		System.out.println("본봉을 입력하시오");
		money = sc.nextInt();
		System.out.println("직급을 입력하싳오.");
		rank = sc.nextInt();
		
		switch(rank)
		{
		case 5:
		case 6:
			tax = 12;
			break;
		case 7:
		case 8:
			tax = 8;
			break;
		default:
			System.out.println("직급입력이 잘못되었습니다.");
			return;
			
		}
		real = (money*(100-tax))/100;
		System.out.println("실수령액(세근"+tax+"%적용)  :  "+real);
		
	}

}
