package homework_0418;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		int zikgeb;
		int bonbong;
		double realmoney;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ� :");
		zikgeb = sc.nextInt();
		System.out.println("������ �Է��Ͻÿ� :");
		bonbong = sc.nextInt();
		
		System.out.println("���� : "+ zikgeb);
		System.out.println("���� : "+ bonbong);
		
		switch (zikgeb) {
		case 7:
		case 8:
			realmoney = bonbong * 0.92;
			System.out.println("�Ǽ��ɾ� : "+ realmoney);
			
			break;
		case 5:
		case 6:
			realmoney = bonbong * 0.88;
			System.out.println("�Ǽ��ɾ� : "+ realmoney);
			
		default:
			break;
		}

	}
}
