package qiz5;

import java.util.Scanner;

public class qiz5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		int a=0;
		int sum=0;
		int b=0;
		System.out.println("����� �Է�:");
		n= sc.nextInt();
		do{
			sum=sum+a;
			a=a+3;
			b++;
			if(a>n){
			System.out.println(n+"�� �Ѿ��� ���� ��:"+a);	
			}
			}while(a<n);
		System.out.println(n+"�� �Ѿ��� �������� ���հ�:"+sum);
		System.out.println(n+"�� �Ѿ��� ������ �� ���� 3�� ����ΰ�:"+b);

	}
	

}
