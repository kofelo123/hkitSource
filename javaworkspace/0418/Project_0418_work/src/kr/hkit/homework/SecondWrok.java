package kr.hkit.homework;

import java.util.Scanner;

public class SecondWrok {
	Scanner scanner = new Scanner(System.in);
	int firstNum,secondNum;
	
	public void input(){
		System.out.print("ù���� ���ڸ� �Է����ּ���:");
		firstNum=scanner.nextInt();
		System.out.print("�ι��� ���ڸ� �Է����ּ���:");		
		secondNum=scanner.nextInt();
		
	}

	public void check(){
		if((firstNum%2==0 && secondNum%2==0)||(firstNum%2==1 && secondNum%2==1)){
			System.out.println("�� ���ڴ� ¦�� �Ǵ� Ȧ���Դϴ�.");
		}else{
			System.out.println("�� ���ڴ� Ȧ,¦�� ���ΰ� ��ġ���� �ʽ��ϴ�.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondWrok secondWrok = new SecondWrok();
		secondWrok.input();
		secondWrok.check();
	}

}
