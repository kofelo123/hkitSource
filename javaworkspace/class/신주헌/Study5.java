package Homework;

import java.util.Scanner;

public class Study5 {
	public static void main(String[] args){
		int Rank,time,salay;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���:");
		Rank = scan.nextInt();
		
		System.out.println("�ٹ��ð� �Է��ϼ���:");
		time = scan.nextInt();
		
		switch (Rank) {
		case 5:
		case 6://�ð��� 20000
			salay = time * 15000;
			System.out.println("����:" +Rank+"��");
			System.out.println("�ٹ��ð�:" + time +"�ð�");
			System.out.println("�ֱ޿�:" + salay);
			
			
			if(time>40){
				salay = (int)(time * 15000 * 1.5);
			}
			else if(time<40){
				salay = time * 15000;
			}
			break;
			
		case 7:
		case 8://�ð��� 15000
			salay = time * 15000;
			System.out.println("����:" +Rank+"��");
			System.out.println("�ٹ��ð�:" + time +"�ð�");
			System.out.println("�ֱ޿�:" + salay);
			if(time>40){
				salay = (int)(time * 15000 * 1.5);
			}
			else if(time<40){
				salay = time * 15000;
			}
			break;

		default:
			System.out.println("�߸��Է��߾��");
			break;
		}
	}
}
