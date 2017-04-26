package kr.hkit.homework;

import java.util.Scanner;

public class FivethWork {
	Scanner scanner = new Scanner(System.in);
	int price,time,payMoney;
	double sale;
	
	public void input(){
		System.out.println("물건값을 입력해주세요:");
		price=scanner.nextInt();
		System.out.println("시간을 입력해주세요:");
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

		System.out.println("구입시간:"+time);
		System.out.println("총 구입금액:"+price);
		System.out.println("실제 지불 금액:"+cal());
		
	}
	
	
	public static void main(String[] args) {

		FivethWork fivethWork = new FivethWork();
		fivethWork.input();
		fivethWork.printInfor();
	}
	
	
}
