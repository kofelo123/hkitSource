package test06;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
	//�Է¹��� ���ڿ��� ¦�� �ܸ� ���������� ���

		Scanner sc = new Scanner(System.in);
		
		int num, i;
		
		num=0;
		i=9;
		
		System.out.println("���� �Է��ϼ���");
		num = sc.nextInt();
		
		System.out.println("**" + num + "��**");
		do{
			if(i%2 == 0){
				System.out.println(i + "*" + num + " = " + i*num);
			}
			i--;
			
		}while(i!=0);
		
	}

}
