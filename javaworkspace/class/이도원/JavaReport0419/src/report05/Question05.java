package report05;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input_number = 0;
		int third_multiple = 0;
		int sum = 0;
		int count = 0;
		
		System.out.println("���ڸ� �Է��ϼ���.");
		System.out.print("==> ");
		input_number = scan.nextInt();
		
		do{
			third_multiple += 3;
			sum += third_multiple;
			count++;
			
		} while(input_number > sum);
		
		System.out.println("\n����� �Է� : " + input_number);
		System.out.println(input_number + "�� �Ѿ��� ���� �� : " + third_multiple);
		System.out.println(input_number + "�� �Ѿ��� �������� �� �հ� : " + sum);
		System.out.println(input_number + "�� �Ѿ��� �������� �� ��° 3�� ����ΰ� : " + count);
	}

}
