package chap08;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=1,b=0;
		
		do{
			System.out.print("���� �����ϴ� ����?(����0): ");
			a=in.nextInt();
			switch(a){
			case 0:
				System.out.println("******�����մϴ�******");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("******"+a+"******");
				System.out.println(a+"���� ���� �ش�˴ϴ�");
				continue;
			case 6:
			case 7:
			case 8:
				System.out.println("******"+a+"******");
				System.out.println(a+"���� ������ �ش�˴ϴ�");
				continue;
			case 9:
			case 10:
			case 11:
				System.out.println("******"+a+"******");
				System.out.println(a+"���� ������ �ش�˴ϴ�");
				continue;
			case 1:
			case 2:
			case 12:
				System.out.println("******"+a+"******");
				System.out.println(a+"���� �ܿ￡ �ش�˴ϴ�");
				continue;
			default:
				System.out.println("******"+a+"******");
				System.out.println(a+"���� �����ϴ�");
				continue;
			}
		}while(a!=0);
	}

}
