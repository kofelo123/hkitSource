package ex;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("ù��° ��");
		a = sc.nextInt();
		System.out.println("�ι�° ��");
		b = sc.nextInt();
		if(a%2==0 && b%2==0){
			System.out.println("�� ���ڴ� ��� ¦�� �Դϴ�.");
		}else if(a%2==1 && b%2==1){
			System.out.println("�� ���ڴ� ��� Ȧ�� �Դϴ�.");
		}else{
			System.out.println("�ϳ��� ¦�� �ϳ��� Ȧ�� �Դϴ�.");
		}
	}

}
