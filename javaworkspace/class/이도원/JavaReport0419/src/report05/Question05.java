package report05;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input_number = 0;
		int third_multiple = 0;
		int sum = 0;
		int count = 0;
		
		System.out.println("숫자를 입력하세요.");
		System.out.print("==> ");
		input_number = scan.nextInt();
		
		do{
			third_multiple += 3;
			sum += third_multiple;
			count++;
			
		} while(input_number > sum);
		
		System.out.println("\n사용자 입력 : " + input_number);
		System.out.println(input_number + "을 넘었을 때의 값 : " + third_multiple);
		System.out.println(input_number + "을 넘었을 때까지의 총 합계 : " + sum);
		System.out.println(input_number + "을 넘었을 때까지의 몇 번째 3의 배수인가 : " + count);
	}

}
