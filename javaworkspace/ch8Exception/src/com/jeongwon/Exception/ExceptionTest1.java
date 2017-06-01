package com.jeongwon.Exception;

import java.util.Scanner;

public class ExceptionTest1 {
	public static void main(String[] args){
		int age = 0;
		System.out.println("���̸� �Է� : ");
		try{
			age = readAge();
			System.out.println("�������� ���� �����ϴ�.");
		}catch(AgeInputException e){
			System.out.println(e.getMessage());
		}
		System.out.println("����� ���̴� "+ age + "���Դϴ�.");
		
	}
	public static int readAge() throws AgeInputException{//���� �Է¹޾� return�ϱ�
		
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
		super("��ȿ���� �ʴ� ���̰� �ԷµǾ����ϴ�.");
	}
	
}