package qiz8;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class qiz8 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int a;
		int n=1;
		System.out.println("=====================");
		System.out.println("���� �����ϴ� ����?(����:0)");
		System.out.println("=====================");
		a=sc.nextInt();
		
do{
	
	switch (a) {
	case 12: case 1: case 2:
		System.out.println("****** "+a+"��  ******");	
		System.out.println(a+"���� �ܿ￡ �ش�˴ϴ�.");		
		break;
	case 3: case 4: case 5:
		System.out.println("****** "+a+"��  ******");	
		System.out.println(a+"���� ���� �ش�˴ϴ�.");	
		break;
	case 6: case 7: case 8:
		System.out.println("****** "+a+"��  ******");	
		System.out.println(a+"���� ������ �ش�˴ϴ�.");	
		break;
	case 9: case 10: case 11:
		System.out.println("****** "+a+"��  ******");	
		System.out.println(a+"���� ������ �ش�˴ϴ�.");	
		break;
	case 0:
		System.out.println("����Ǿ����ϴ�");
		break;
	default:
		System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�.");
		break;
	}
	
	
}while(a<0);
}
}
