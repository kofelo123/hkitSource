package kr.hkit.Prob2;

import java.util.Scanner;

public class Prob4_14 {
	
	public static void main(String[] args) {
		
		int answer=(int)(Math.random()*101) ;//1~100 ������ ���� ������
		int input=0,count=0;//�Է�,ī��Ʈ
		
		Scanner scanner = new Scanner(System.in);
		
		do{
			count++;
			
			if(input==answer)//do while�� ���� 1ȸ�� ���ԵǴ°� ����.
				break;
			
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			input = scanner.nextInt();
			
			if(input==answer){
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� "+count+"���Դϴ�.");
			}else{
				if(input>answer)
					System.out.println("�� �������� �Է����ּ���.");
				else
					System.out.println("�� ū���� �Է����ּ���.");
			}
			
		}while(true);
		
	}
}