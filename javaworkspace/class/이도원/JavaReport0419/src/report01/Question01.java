package report01;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input_number, sum = 0;
		
		System.out.println("���ڸ� �Է��ϼ���.");
		System.out.print("==> ");
		input_number = scan.nextInt();
		
		do{
			sum += input_number;
			
			input_number--;
			
		}while(input_number >= 1);
		
		System.out.println("\n1������ �� : " + sum);
	}

}
