package kr.hkit.homework;

import java.util.Scanner;

public class SixWork {
	Scanner scanner = new Scanner(System.in);
	int grade,workTime,timeMoney,nomalPay,overPay,totalMoney;

	
	public void input(){
		System.out.println("������ �Է����ּ���:");
		grade=scanner.nextInt();
		System.out.println("�ٹ��ð� �Է����ּ���:");
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
			System.out.println("�� �޿�:"+totalMoney);
		}else {
			workTime=40;
			totalMoney=workTime*timeMoney;
			System.out.println("�� �޿�:"+totalMoney);
		
		}
		
	}
	
	
	public static void main(String[] args) {
		SixWork sixWork = new SixWork();
		sixWork.input();
		sixWork.calTimeMoney();
		sixWork.calTotalMoney();
	}

}
