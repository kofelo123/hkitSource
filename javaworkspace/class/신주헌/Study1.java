package Homework;

import java.util.Scanner;

public class Study1 {
	public static void main(String[] args){
		int age;
		double score;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���:");
		age = scan.nextInt();
		
		System.out.println("���� �Է��ϼ���:");
		score = scan.nextDouble();
		
		if(age<30 && score>=3.5){
			System.out.println("��õ����Դϴ�");
		}else{
			System.out.println("��õ���ƴմϴ�");
		}
	}
}
