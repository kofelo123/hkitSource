package Homework;

import java.util.Scanner;

public class Mart {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int time,price,totalprice;
		
		System.out.print("�ð��� �Է��ϼ���");
		time = scan.nextInt();
		System.out.print("���ǰ��� �Է��ϼ���:");
		price = scan.nextInt();
		
		if(time<12){
			totalprice = (int)(price-(price*0.05));
			System.out.println("���Խð�:" +time);
			System.out.println("�ѱ��Աݾ�:" + price);
			System.out.println("���� ���� �ݾ�:" +totalprice);
			
		}else if(time>=12){
			totalprice = (int)(price-(price*2.5));
			System.out.println("���Խð�:" +time);
			System.out.println("�ѱ��Աݾ�:" + price);
			System.out.println("���� ���� �ݾ�:" +totalprice);
		}
		
		
	}
}
