package com.jeongwon.chap2;

import java.util.Scanner;

public class Game {
	
public static String check(int a){
	
	String result = null;
	
	switch (a) {
	case 1:
		result="����";
		break;		
	case 2:
		result="����";
		break;		
	case 3:
		result="��";
		break;
		}	
	return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num;
		int com;
		
		System.out.print("1~3���� ��ȣ �Է�:");
		num=scanner.nextInt();
		com=(int)(Math.random()*3+1);
		
		
		switch (num-com) {
		case 0:
			System.out.println("�����ϴ�.");
			System.out.print("���:"+check(num)+" , ��ǻ��:"+check(com));
			break;
		case -2:
		case 1:
			System.out.println("����� �¸��Դϴ�.");
			System.out.print("���:"+check(num)+" , ��ǻ��:"+check(com));
			break;
		case -1:
		case 2:
			System.out.println("����� �����ϴ�.");
			System.out.print("���:"+check(num)+" , ��ǻ��:"+check(com));
			break;
		
		}
		
		
	}
	
	

}