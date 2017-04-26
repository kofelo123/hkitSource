package for_moon;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("숫자를 입력하시오: ");
		input=sc.nextInt();
		
		/*for(int i=0; i<10; i++){
			for(int j=0; j<i; j++){
			System.out.print("*"); 
			}
			System.out.println();
		}*/
		
		for(int i=input; i>0; i--){
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
				System.out.println();
		}
	}

}
