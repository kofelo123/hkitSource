package housework;

import java.util.Scanner;

public class sol5 {
	public static void main(String[] args){
		int N=3;
		int i=0;//��°
		int sum=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����� �Է�:");
		i = scan.nextInt();
		do{
			if(N%3==0){
				sum+=N;
			}
			N+=3;
		}while(N<i);
		System.out.println(i+"�� �Ѿ������� ��:"+N);
		System.out.println(i+"�� �Ѿ������� ���հ�:"+sum);
//		System.out.println(i+"�� �Ѿ��� �� ���� ���° 3�� ����ΰ�:");
	}
}
