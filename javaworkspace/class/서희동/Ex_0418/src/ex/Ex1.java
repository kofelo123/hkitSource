package ex;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		double score;
		System.out.println("���� :");
		age = sc.nextInt();
		System.out.println("����");
		score = sc.nextDouble();
		
		if(age<=30 && score>=3.5){
			System.out.println("��õ ����Դϴ�.");
		}else{
			System.out.println("��õ ����� �ƴմϴ�.");
		}
	}

}
