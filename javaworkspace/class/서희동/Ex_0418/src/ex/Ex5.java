package ex;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		int price;
		int time;
		double sil;  //�� �޿�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �ð� : ");
		time = sc.nextInt();
		System.out.println("���� ���� : ");
		price = sc.nextInt();
		
		if(time<12){
			sil=price-(price*5/100);
			System.out.println("���� �ð� : "+time+"��");
			System.out.println("�� ���� �ݾ� : "+price+"��");
			System.out.println("���� ���� �ݾ� : "+sil+"��");
		}else{
			sil=price-(price*2.5/100);
			System.out.println("���� �ð� : "+time+"��");
			System.out.println("�� ���� �ݾ� : "+price+"��");
			System.out.println("���� ���� �ݾ� : "+sil+"��");
		}
	}

}
