package quest08;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int select=0;
		
		do{
			System.out.println("========================");
			System.out.println("���� �����ϴ� ����?(����:0)");
			System.out.println("========================");
			
			select=scan.nextInt();
			
			switch(select){
			
			case 12:
			case 1:
			case 2:
				System.out.println(select+"���� �ܿ��Դϴ�.");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(select+"���� ���Դϴ�.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(select+"���� �����Դϴ�.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(select+"���� �����Դϴ�");
				break;
			case 0:
				return;
			default:
				System.out.println("�߸��Է��߽��ϴ�.");
				break;		
			}
			
		}while(true);		
	}
}
