package report03;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		int input_number;
		int sum = 0;
		
		do{
			System.out.println("숫자를 입력하세요.");
			System.out.print(i + " 번 ==> ");
			input_number = scan.nextInt();
			if(input_number > 0){
				sum += i;
			}
			i++;
			
		} while(i < 11);
		
		System.out.println("\n0보다 큰 수의 합 : " + sum);
	}

}
