package report07;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input_number;
		int count = 0;
		int sum = 0;
		
		do {
			System.out.print("숫자를 입력 : ");
			input_number = scan.nextInt();
			count++;
			
			if(count%2 == 0){
				sum += (-input_number);
			}
			else {	
				sum += input_number;
			}
			
		} while(count < 10);
		
		System.out.println("숫자의 합 : " + sum);

	}

}
