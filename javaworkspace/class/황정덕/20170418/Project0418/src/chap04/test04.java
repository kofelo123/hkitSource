package chap04;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		String duk;
		System.out.print("������ �Է��Ͻÿ� : ");
		a=in.nextInt();
		System.out.print("������ �Է��Ͻÿ� : ");
		b=in.nextInt();
		switch(a){
		case 5:
		case 6:
			System.out.println("���� : "+a+"��");
			System.out.println("���� : "+b);
			System.out.println("�Ǽ��ɾ�(���� 12%) : "+(b-b*0.12));
			break;
		case 7:
		case 8:
			System.out.println("���� : "+a+"��");
			System.out.println("���� : "+b);
			System.out.println("�Ǽ��ɾ�(���� 8%) : "+(b-b*0.08));
			break;	
		default:
			break;
		}
	}

}
