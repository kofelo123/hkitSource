package homework1_2;

import java.util.*;

public class Homework1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num_1, num_2;
		System.out.println("�� ���� ���ڸ� �Է��Ͻÿ�.");
		num_1 = sc.nextInt();
		num_2 = sc.nextInt();
		
		if(num_1%2 == num_2%2)
			System.out.println("�� ���ڴ� ���� ¦�� �Ǵ� Ȧ���Դϴ�.");
		else
			System.out.println("�� ���ڴ� ���� ¦�� �Ǵ� Ȧ���� �ƴմϴ�.");
		
	}

}
