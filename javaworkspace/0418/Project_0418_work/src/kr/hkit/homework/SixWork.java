package kr.hkit.homework;

import java.util.Scanner;

public class SixWork {
	Scanner scanner = new Scanner(System.in);
	int grade,workTime,timeMoney,nomalPay,overPay,totalMoney;

	
	public void input(){
		System.out.println("직급을 입력해주세요:");
		grade=scanner.nextInt();
		System.out.println("근무시간 입력해주세요:");
		workTime=scanner.nextInt();
		
	}
	
	public void calTimeMoney(){
		if(grade==7 || grade==8){
			timeMoney=15000;
		}else if(grade==5 || grade==6){
			timeMoney=20000;
		}
	}
	
	public void calTotalMoney(){
		if(workTime>40){
			nomalPay=40*timeMoney;
			overPay=(workTime-40)*(int)(timeMoney*1.5);	
			totalMoney=overPay+nomalPay;
			System.out.println("주 급여:"+totalMoney);
		}else {
			workTime=40;
			totalMoney=workTime*timeMoney;
			System.out.println("주 급여:"+totalMoney);
		
		}
		
	}
	
	
	public static void main(String[] args) {
		SixWork sixWork = new SixWork();
		sixWork.input();
		sixWork.calTimeMoney();
		sixWork.calTotalMoney();
	}

}
