package chap06;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c;
		String duk;
		System.out.print("������ �Է��Ͻÿ� : ");
		a=in.nextInt();
		System.out.print("�ٹ��ð��� �Է��Ͻÿ� : ");
		b=in.nextInt();
		switch(a){
		case 5:
		case 6:
			if(b>40){
				c=b-40;
				System.out.println("���� : "+a+"��");
				System.out.println("�ٹ��ð� : "+b+"�ð�");
				System.out.println("�ֱ޿� : "+(40*20000+c*20000*1.5));
			}else{
				System.out.println("���� : "+a+"��");
				System.out.println("�ٹ��ð� : "+b+"�ð�");
				System.out.println("�ֱ޿� : "+40*20000);
			}
			break;
		case 7:
		case 8:
			if(b>40){
				c=b-40;
				System.out.println("���� : "+a+"��");
				System.out.println("�ٹ��ð� : "+b+"�ð�");
				System.out.println("�ֱ޿� : "+(40*15000+c*15000*1.5));
			}else{
				System.out.println("���� : "+a+"��");
				System.out.println("�ٹ��ð� : "+b+"�ð�");
				System.out.println("�ֱ޿� : "+40*15000);
			}
			break;	
		default:
			break;
		}

	}

}
