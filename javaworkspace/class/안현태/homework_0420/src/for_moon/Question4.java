package for_moon;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int input = sc.nextInt();
		int n = 1;
		int count = 0;

		for (int i = 2; i <= input; i++) {
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) 
					count++;    
			} //���� for
				if (count == 2) {
				System.out.println(i);
				//count = 0; ���������� count �ʱ�ȭ�� �ȵ�(if���̴ϱ�)
				} 
				count = 0;
			
				
		} // �ٱ�for

	}
}
