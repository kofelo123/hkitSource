package com.jeongwon.Exception;

import java.util.Scanner;

public class ExceptionTest1 {
	public static void main(String[] args){
		int age = 0;
		System.out.println("나이를 입력 : ");
		try{
			age = readAge();
			System.out.println("정상으로 값이 들어갔습니다.");
		}catch(AgeInputException e){
			System.out.println(e.getMessage());
		}
		System.out.println("당신의 나이는 "+ age + "세입니다.");
		
	}
	public static int readAge() throws AgeInputException{//나이 입력받아 return하기
		
		Scanner kb = new Scanner(System.in);
		int age = kb.nextInt();
		
		if(age < 0 ){
			throw new AgeInputException();
		}
		return age;
		
	}
}

class AgeInputException extends Exception {
	public AgeInputException(){
		super("유효하지 않는 나이가 입력되었습니다.");
	}
	
}