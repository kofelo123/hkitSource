package housework;

import java.util.Scanner;

public class sol8 {
	public static void main(String[] args){
		
		int month=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("���� �����ϴ� ����?(����:0)");
		System.out.println("---------------------");
		month = scan.nextInt();
		System.out.println("******"+month+"��******");
		do{
			if(month==12|| month==1||month==2){
				System.out.println(month+"���� �ܿ￡ �ش�˴ϴ�");
			}
			else if(month==3|| month==4||month==5){
				System.out.println(month+"���� ���� �ش�˴ϴ�");
			}
			else if(month==6|| month==7||month==8){
				System.out.println(month+"���� ������ �ش�˴ϴ�");
			}
			else if(month==9|| month==10||month==11){
				System.out.println(month+"���� ������ �ش�˴ϴ�");
			}
			if(month==0){
				System.out.println("����");
				System.exit(0);
			}
			break;
		}while(true);
	}
}
