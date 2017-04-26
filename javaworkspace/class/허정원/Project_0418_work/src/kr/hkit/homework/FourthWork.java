package kr.hkit.homework;

import java.util.Scanner;

public class FourthWork {
	Scanner scanner = new Scanner(System.in);
	int grade,money,taxMoney;
	
	public void input(){
		System.out.print("직급입력:");
		grade=scanner.nextInt();
		System.out.println("봉급입력:");
		money=scanner.nextInt();
	}
	
	public void taxPrint(){
		
		System.out.println("직급:"+grade);
		System.out.println("본봉"+money);
		System.out.println("실수령액(세금적용):"+taxCal());
		
		
	}
	public int taxCal(){
		if((grade==7||grade==8)){
			taxMoney=money-(int)(money*0.08);
		}else if((grade==5||grade==6)){
			taxMoney=money-(int)(money*0.12);
		}
		
		return taxMoney;
	}

	public static void main(String[] args) {
		FourthWork fourthWork = new FourthWork();
		fourthWork.input();
		fourthWork.taxPrint();
	}

}
