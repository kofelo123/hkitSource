package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//���� �Է� �� 1���� �� ���ڱ��� ���� ���϶�
	
		Scanner sc  = new Scanner(System.in);
		
		int num =0, sum = 0, i = 1;
		
		System.out.println("���ڸ� �Է��ϼ���");
		num = sc.nextInt();
		
		do{
			sum = sum + i;
			i++;
	//		System.out.println("sum��" + sum);
			
		}while(i <= num);
		
		System.out.println(num + "������ ����" + sum +"�Դϴ�");
	
	}

}
