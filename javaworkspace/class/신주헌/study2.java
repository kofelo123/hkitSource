package Homework;

import java.util.Scanner;

public class study2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		System.out.print("1��° ���� �Է��ϼ���:");
		num1 = scan.nextInt();
		System.out.print("2��° ���� �Է��ϼ���:");
		num2 = scan.nextInt();
		
		
		if((num1%2==0 && num2%2==0) || (num1%2!=0 && num2%2!=0)){
			System.out.println("�μ��ڴ� ���� ¦���Ǵ� Ȧ�� �Դϴ�.");
		}
		else{
			System.out.println("����");
		}
	}
}
