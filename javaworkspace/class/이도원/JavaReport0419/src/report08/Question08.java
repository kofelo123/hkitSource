package report08;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input_number;
		String msg = "";
		
		while(true){
			System.out.println("==========================");
			System.out.println("���� �����ϴ� ����?(����:0)");
			System.out.println("==========================");
			System.out.print("==> ");
			
			input_number = scan.nextInt();
			
			System.out.println("*****" + input_number + "�� *****");
			
			switch(input_number){
			case 12:
			case 1:
			case 2:
				System.out.println(input_number + "���� �ܿ��Դϴ�.\n");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(input_number + "���� ���Դϴ�.\n");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(input_number + "���� �����Դϴ�.\n");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(input_number + "���� �����Դϴ�.\n");
				break;
			case 0:
				System.out.println("���� �Ǿ����ϴ�.");
				return;
			default:
				System.out.println("0~12������ ���� �Է��� �ּ���.\n");
				break;	
			}
		}
		
	}

}
