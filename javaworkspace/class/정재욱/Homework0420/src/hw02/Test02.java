package hw02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();
		
		int count=0;
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print(++count + " ");
			}
			System.out.println();
		}
	}

}
