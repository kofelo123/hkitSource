package kr.hkit.homework;

import java.util.Scanner;

public class FivethWork {
	Scanner scanner = new Scanner(System.in);
	int price,time,payMoney;
	double sale;
	
	public void input(){
		System.out.println("���ǰ��� �Է����ּ���:");
		price=scanner.nextInt();
		System.out.println("�ð��� �Է����ּ���:");
		time=scanner.nextInt();
		
	}
	
	public void perCent(){
		
		if(time<12){
			sale=5*0.01;
		}else{
			sale=2.5*0.01;
		}
		
		
		
	}
	
	public int cal(){
		perCent();
	payMoney=price-(int)(price*sale);
		
		return payMoney;
	}
	
	public void printInfor(){

		System.out.println("���Խð�:"+time);
		System.out.println("�� ���Աݾ�:"+price);
		System.out.println("���� ���� �ݾ�:"+cal());
		
	}
	
	
	public static void main(String[] args) {

		FivethWork fivethWork = new FivethWork();
		fivethWork.input();
		fivethWork.printInfor();
	}
	
	
}
