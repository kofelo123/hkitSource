package chap05;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=1,b=3;
		int sum=0;
		int c=0;
		int count=0;
		System.out.print("����� �Է� : ");
		a=in.nextInt();
		do{
			sum=sum+b;
			b=b+3;
			count++;
		}while(b<a);
		System.out.println(a+"�� �Ѿ��� ���� �� : "+b);
		System.out.println(a+"�� �Ѿ��� �������� ���հ� : "+sum);
		System.out.println(a+"�� �Ѿ��� ������ �� ���� 3�� ����ΰ� : "+(count+1));
	}

}
