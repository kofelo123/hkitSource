package Test1;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int money;
		double result = 0;
		double result2 =0 ;
		
		System.out.println("직급을 입력하세요1.7급8급,2.5급6급");
		a=sc.nextInt();
		
		System.out.println("본봉을 입력하세요");
		money=sc.nextInt();
		
		if(1==a){
			result=money-money*0.08;
		}else if(2==a){
		result2=money-money*0.12;
		}
		

		if(1==a){
			System.out.println("직급"+a);
			System.out.println("본봉"+money);
			System.out.println("실수령액"+result);
		}else if(2==a){
			System.out.println("직급"+a);
			System.out.println("본봉"+money);
			System.out.println("실수령액"+result2);
		}else {
			System.out.println("표준입니다");
				
			}
	}

}

