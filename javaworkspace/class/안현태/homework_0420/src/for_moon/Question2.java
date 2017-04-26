package for_moon;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		int count=0;
		System.out.println("숫자를 입력하시오: ");
		input=sc.nextInt();
		
		for(int i=1; i<=input; i++){
			for(int j=1; j<=input; j++){
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
}
