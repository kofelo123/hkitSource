package homework2_5;

import java.util.*;

public class Homework2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int three = 0, sum = 0, over = 0, user = 0;
		int num = 1;// (3)�� ����ΰ�
		System.out.println("����� �Է� : ");
		user = sc.nextInt();
		do
		{
			three = num*3;
			sum += three;
			num++;
		}while(three<user);
//		over = 3*num;
		System.out.println(user+"�� �Ѿ��� ���� �� : "+three);
		System.out.println(user+"�� �Ѿ��� �������� ���հ� : "+(sum-three));
		System.out.println(user+"�� �Ѿ��� ������ �� ��° 3�� ����ΰ� : "+three/3);
		
	}

}
