package report06;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input_number;
		int count = 8;
		System.out.print("사용자 입력 : ");
		input_number = scan.nextInt();
		
		System.out.println("** " + input_number + "단 **");
		
		do{
			System.out.println(count + " * " + input_number + " = " + count*input_number);
			count -= 2;
			
		}while(count >= 2);

	}

}
