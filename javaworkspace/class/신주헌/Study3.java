package Homework;

import java.util.Scanner;

public class Study3 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int gender, toeicjumsu;
		System.out.println("���� �Է��ϼ���:");
		gender = scan.nextInt();
		System.out.println("������ �Է��ϼ���:");
		toeicjumsu = scan.nextInt();
		
		if((gender==1 && toeicjumsu>=700) || (gender==2 && toeicjumsu>=800)){
			System.out.println("�װ� �¹��� �����ڰ� �����մϴ�");
		}
		else{
			System.out.println("�ڰݾ����ϴ�");
		}
	}
}
