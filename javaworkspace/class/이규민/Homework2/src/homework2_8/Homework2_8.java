package homework2_8;

import java.util.*;

public class Homework2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int user = 0;
		do
		{
			System.out.println("============================");
			System.out.println("���� �����ϴ� ����?(����:0)");
			System.out.println("=============================");
			user = sc.nextInt();
			if(user == 0)
				break;
			else if(user<3)
			{
				System.out.println("******* "+user+"�� ******");
				System.out.println(user+"���� �ܿ￡ �ش�˴ϴ�.");
			}
			else if(user<6)
			{
				System.out.println("******* "+user+"�� ******");
				System.out.println(user+"���� ���� �ش�˴ϴ�.");
			}
			else if(user<9)
			{
				System.out.println("******* "+user+"�� ******");
				System.out.println(user+"���� ������ �ش�˴ϴ�.");
			}
			else if(user<12)
			{
				System.out.println("******* "+user+"�� ******");
				System.out.println(user+"���� ������ �ش�˴ϴ�.");
			}
			else if(user==12)
			{
				System.out.println("******* "+user+"�� ******");
				System.out.println(user+"���� �ܿ￡ �ش�˴ϴ�.");
				
			}
			else 
			{
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			}
		}while(true);
	}

}
