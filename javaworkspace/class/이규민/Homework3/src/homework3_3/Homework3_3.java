package homework3_3;

import java.util.*;

public class Homework3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�ϳ��� ���ڸ� �Է��Ͻÿ� : ");
		int user = sc.nextInt();
		for(int i= user; i>0; i--)
		{
			for(int j = 0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
