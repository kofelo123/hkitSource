package quiz7;

import java.util.Scanner;

public class quiz7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int kg; int cm; double skg; int a; double b;
		
		System.out.println("������ �����Ͽ��ֽʽÿ�.");
		System.out.println("1.���� 2.����");
		
		a = sc.nextInt();
		if(a==1){ System.out.println("Ű�� �Է��� �ּ���.");
		 cm = sc.nextInt();
		 skg =cm-100;
		 System.out.println("�����Ը� �Է����ּ���.");
		 kg = sc.nextInt();
		 b = skg/20;
		 System.out.println("ǥ�ظ����Ա�����"+(skg+b)+"~"+(skg-b)+"kg�Դϴ�"); 
		 if(kg-skg+b>5){ System.out.println(kg-skg+b+"% �ʰ��̹Ƿ� ����� ��ü���Դϴ�");}
		 else if(kg-skg+b<0){System.out.println(kg-skg+b+"% �����ϹǷ� ����� ǥ�ع̴��Դϴ�.");}
		 else System.out.println("����� ǥ��ü���Դϴ�.");
		}
		 else if(a==2){ System.out.println("Ű�� �Է��� �ּ���.");
		 cm = sc.nextInt();
		 skg =cm-105;
		 b = skg/20;
		 System.out.println("�����Ը� �Է����ּ���.");
		 kg = sc.nextInt();
		 System.out.println("ǥ�ظ����Ա�����"+(skg+b)+"~"+(skg-b)+"kg�Դϴ�"); 
		 if(kg-skg+b>5){ System.out.println(kg-skg+b+"% �ʰ��̹Ƿ� ����� ��ü���Դϴ�");}
		 else if(kg-skg+b<0){System.out.println(kg-skg+b+"% �����ϹǷ� ����� ǥ�ع̴��Դϴ�.");}
		 else System.out.println("����� ǥ��ü���Դϴ�.");
	}
	}

}
