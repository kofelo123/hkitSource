package ex;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		int grade;
		int money;
		int sil;  //�� �޿�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		grade = sc.nextInt();
		System.out.println("���� : ");
		money = sc.nextInt();
		
		if(grade ==7 || grade == 8){
			sil = money-(money*6/100);
			System.out.println("���� : "+grade+"��");
			System.out.println("���� : "+money+"��");
			System.out.println("�Ǽ��ɾ�(���� 6%����)"+sil+"��");
		}else if(grade == 5 || grade == 6){
			sil = money-(money*12/100);
			System.out.println("���� : "+grade+"��");
			System.out.println("���� : "+money+"��");
			System.out.println("�Ǽ��ɾ�(���� 12%����)"+sil+"��");
		}

	}

}
