package com.jeongwon.chap2;

import java.util.Scanner;

public class Game {
	
public static String check(int a){
	
	String result = null;
	
	switch (a) {
	case 1:
		result="가위";
		break;		
	case 2:
		result="바위";
		break;		
	case 3:
		result="보";
		break;
		}	
	return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num;
		int com;
		
		System.out.print("1~3까지 번호 입력:");
		num=scanner.nextInt();
		com=(int)(Math.random()*3+1);
		
		
		switch (num-com) {
		case 0:
			System.out.println("비겼습니다.");
			System.out.print("당신:"+check(num)+" , 컴퓨터:"+check(com));
			break;
		case -2:
		case 1:
			System.out.println("당신의 승리입니다.");
			System.out.print("당신:"+check(num)+" , 컴퓨터:"+check(com));
			break;
		case -1:
		case 2:
			System.out.println("당신이 졌습니다.");
			System.out.print("당신:"+check(num)+" , 컴퓨터:"+check(com));
			break;
		
		}
		
		
	}
	
	

}
