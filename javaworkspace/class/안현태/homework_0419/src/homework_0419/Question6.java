package homework_0419;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		int i=9;
		int total=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하시오: ");
		int a = sc.nextInt();
		
		
		do{		
			if(i%2==0){
			System.out.println(i+"*"+a+"="+(i*a));
			}
			
			i--;
					
		}
		while(i>0);

	}

}
