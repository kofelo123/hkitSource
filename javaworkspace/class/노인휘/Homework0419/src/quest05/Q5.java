package quest05;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num=0;
		int a=0;
		int count =0;
		int sum=0;
		
		System.out.println("�ϳ��� ���ڸ� �Է��ϼ���");
		num=scan.nextInt();
		
		do{
			a=a+3;
			count++;
			if(a>num){
				break;
			}
			sum+=a;			

				
		}while(true);
				
		System.out.println("����� �Է� : "+num);
		System.out.println(num+"�� �Ѿ��� ���� ��: "+a );
		System.out.println(num+"�� �Ѿ��� �������� ���հ�: "+sum);
		System.out.println(num+"�� �Ѿ��� ������ �� ��° 3�� ����ΰ�: "+count);
	}

}
