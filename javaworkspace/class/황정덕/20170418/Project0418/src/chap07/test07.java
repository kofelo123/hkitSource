package chap07;

import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		int standard;
		String duk;
		System.out.print("���� �Է�(m,f) : ");
		duk=in.nextLine();
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		a=in.nextInt();
		System.out.print("�����Ը� �Է��Ͻÿ� : ");
		b=in.nextInt();
		
		if(duk.equals("m")){
			standard = a-100;
		}else if(duk.equals("f")){
			standard = a-105;
		}else{
			System.out.print("������ �߸��Է��Ͽ����ϴ�.");
			return ;
		}
		
		if(b < standard-5){
			System.out.println("���� ����� ���´� �̴��Դϴ�.");
		}
		else if(b >= standard-5 && b < standard+5){
			System.out.println("���� ����� ���´� �����Դϴ�.");
		}
		else {
			System.out.println("���� ����� ���´� �ʰ��Դϴ�.");
		}
		
		
	}

}
