package homework1_4;

import java.util.*;

public class Homework1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money, real, tax, rank;
		
		System.out.println("������ �Է��Ͻÿ�");
		money = sc.nextInt();
		System.out.println("������ �Է��Ϛ��.");
		rank = sc.nextInt();
		
		switch(rank)
		{
		case 5:
		case 6:
			tax = 12;
			break;
		case 7:
		case 8:
			tax = 8;
			break;
		default:
			System.out.println("�����Է��� �߸��Ǿ����ϴ�.");
			return;
			
		}
		real = (money*(100-tax))/100;
		System.out.println("�Ǽ��ɾ�(����"+tax+"%����)  :  "+real);
		
	}

}
