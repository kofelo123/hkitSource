package homework_0418;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		int zikgeb;
		int time;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		zikgeb = sc.nextInt();
		System.out.print("�ٹ��ð� : ");
		time = sc.nextInt();
		
		switch (zikgeb) {
		case 7:
		case 8:
			if(time>=40){
				double realmoney = (40*15000) + ((time-40)*15000*1.5);
				System.out.println("�� �޿� : "+ realmoney);
			}
			else 
				System.out.println("�� �޿�: "+ 40*15000);
			
			break;
		case 5:
		case 6:
			if(time>=40){
				double realmoney = (40*20000) + ((time-40)*20000*1.5);
				System.out.println("�� �޿� : "+ realmoney);
			}
			else
				System.out.println("�� �޿�: "+ 40*20000);
			
			break;
		default:
			break;
		}

	}

}
