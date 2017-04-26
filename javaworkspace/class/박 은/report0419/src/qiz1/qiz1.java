package qiz1;

import java.util.Scanner;

public class qiz1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a;
		int total=0;
		System.out.print("아무 숫자를입력하십시오");
		a= sc.nextInt();
		total=total+a;
		do{a--;
			total=total+a;
			System.out.println("합은:"+total);	
		}while(a>1);
	}

}
