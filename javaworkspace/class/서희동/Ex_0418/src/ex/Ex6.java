package ex;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		int grade;
		int time;
		int money;
		double sil; //�� �޿�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		grade = sc.nextInt();
		System.out.println("�ٹ� �ð� : ");
		time = sc.nextInt();
		
		if((grade==7 || grade==8) && time>=40){
			sil = 40*15000+((time-40)*22500);
			System.out.println("���� : "+grade+"��");
			System.out.println("�ٹ� �ð� : "+time+"�ð�");
			System.out.println("�� �޿� : "+sil+"��");
		}else if((grade==7 || grade==8) && time<=40){
			sil = 40*15000;
			System.out.println("���� : "+grade+"��");
			System.out.println("�ٹ� �ð� : "+time+"�ð�");
			System.out.println("�� �޿� : "+sil+"��");
		}else if((grade==5|| grade==6) && time>=40){
			sil = 40*20000+((time-40)*30000);
			System.out.println("���� : "+grade+"��");
			System.out.println("�ٹ� �ð� : "+time+"�ð�");
			System.out.println("�� �޿� : "+sil+"��");
		}else if((grade==5 || grade==6) && time<=40){
			sil = 40*20000;
			System.out.println("���� : "+grade+"��");
			System.out.println("�ٹ� �ð� : "+time+"�ð�");
			System.out.println("�� �޿� : "+sil+"��");
		}
	}
}
