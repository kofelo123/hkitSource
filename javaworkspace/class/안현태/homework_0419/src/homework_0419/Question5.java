package homework_0419;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i=0;
		int total=0;
		int count=1;
		int a;
		
		System.out.print("����� �Է�: ");
		a = sc.nextInt();
		do{		
			i+=3;
			if(i>a){
			System.out.println(a+"�� �Ѿ��� ���� ��:"+i);
			System.out.println(a+"�� �Ѿ��� �������� ���հ�:"+total);
			System.out.println(a+"�� �Ѿ��� ������ �� ��° 3�� ����ΰ�:"+count);
			break;
			}
			total += i;
			count++;
			
			
		}
		while(true);
	}

}
