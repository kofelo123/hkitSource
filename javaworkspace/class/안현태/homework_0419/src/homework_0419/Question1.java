package homework_0419;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오: ");
		int a = sc.nextInt();
		int total=0;
		int i=0;
		
		do{		
			total+=i;
			i++;
		}
		while(i<=a);
		
		System.out.println("합은 "+ total);

	}

}
