package ex;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int gender;
		int toeic;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("���� �Է� : 1.���� 2.����");
		gender = sc.nextInt();
		System.out.println("���� ���� �Է� : ");
		toeic = sc.nextInt();
		
		if(((gender==1) && toeic>=800) || ((gender==2)&& toeic>=700)) {
			System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�.");
		}else{
			System.out.println("�װ� �¹��� ���� �ڰ� �Ұ�");
		}
	}

}
