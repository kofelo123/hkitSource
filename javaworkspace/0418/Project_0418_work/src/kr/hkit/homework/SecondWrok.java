package kr.hkit.homework;

import java.util.Scanner;

public class SecondWrok {
	Scanner scanner = new Scanner(System.in);
	int firstNum,secondNum;
	
	public void input(){
		System.out.print("첫번쨰 숫자를 입력해주세요:");
		firstNum=scanner.nextInt();
		System.out.print("두번쨰 숫자를 입력해주세요:");		
		secondNum=scanner.nextInt();
		
	}

	public void check(){
		if((firstNum%2==0 && secondNum%2==0)||(firstNum%2==1 && secondNum%2==1)){
			System.out.println("두 숫자는 짝수 또는 홀수입니다.");
		}else{
			System.out.println("두 숫자는 홀,짝수 여부가 일치하지 않습니다.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondWrok secondWrok = new SecondWrok();
		secondWrok.input();
		secondWrok.check();
	}

}
