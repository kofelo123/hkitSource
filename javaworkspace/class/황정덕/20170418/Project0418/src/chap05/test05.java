package chap05;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���� 12�� ���� : ���� �ݾ��� 5%����");
		System.out.println("���� 12�� ���� : ���� �ݾ��� 2.5%����");
		System.out.print("���Խð��� �Է� : ");
		int timea=in.nextInt();
		System.out.print("�ѱ� �Աݾ� �Է� : ");
		int money=in.nextInt();
		
		if(timea<12&&timea>0){
			System.out.println("���Խð� : "+timea+"��");
			System.out.println("�ѱ� �Աݾ� : "+money);
			System.out.println("���� ���� �ݾ� : "+(money-(money*0.05)));
		}else if(timea>=12&&timea<=24){
			System.out.println("���Խð� : "+timea+"��");
			System.out.println("�ѱ� �Աݾ� : "+money);
			System.out.println("���� ���� �ݾ� : "+(money-(money*0.025)));
		}else{
			System.out.println("�ð��� �߸��Է��ϼ̽��ϴ�");
		}
	}

}
