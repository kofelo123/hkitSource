package hw08;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		String season = "";
		
		do{
			System.out.println("====================");
			System.out.print("���� �����ϴ� ����?(����:0)");
			int num=sc.nextInt();
			System.out.println("====================");
			if(num==0) {
				flag = false;
				break;
			}
			System.out.printf("****** %d�� ******\n", num);
			
			switch(num) {
			case 12: case 1: case 2:
				season = "�ܿ�";
				break;
			case 3: case 4: case 5:
				season = "��";
				break;
			case 6: case 7: case 8:
				season = "����";
				break;
			case 9: case 10: case 11:
				season = "����";
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			System.out.println(num + "���� " + season +"�� �ش�˴ϴ�.");
			
			
		}while(flag);
		
	}
}
