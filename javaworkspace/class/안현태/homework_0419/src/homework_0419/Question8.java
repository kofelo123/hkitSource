package homework_0419;

import java.util.Scanner;

public class Question8 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			do{	
				
				System.out.print("���� �����ϴ� ����? ");
				int gj=sc.nextInt();
				if(gj==0){
					break;
				}
				switch (gj) {
				case 3:
				case 4:
				case 5:
					System.out.println(gj+"���� ���� �ش�˴ϴ�");
					break;
				case 6:
				case 7:
				case 8:
					System.out.println(gj+"���� ������ �ش�˴ϴ�");
					break;
				case 9:
				case 10:
				case 11:
					System.out.println(gj+"���� ������ �ش�˴ϴ�");
					break;
				case 12:
				case 1:
				case 2:
					System.out.println(gj+"���� �ܿ￡ �ش�˴ϴ�");
					break;
					
					
				default:
					break;
				}
			}
			while(true);
			
		

	}

}
