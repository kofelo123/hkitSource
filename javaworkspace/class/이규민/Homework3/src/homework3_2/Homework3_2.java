package homework3_2;

import java.util.*;

public class Homework3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�ϳ��� ���ڸ� �Է��Ͻÿ� : ");
		int user = sc.nextInt();
		int num = 1;
		for(int i=0; i<user; i++)
		{
			for(int j=0; j<user; j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		sc.close();
	}

}
