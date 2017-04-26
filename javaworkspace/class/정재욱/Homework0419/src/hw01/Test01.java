package hw01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		int x=sc.nextInt();
		int i=1, total=0;
		
		do{
			total = total+x;
			x--;
		}while(i<=x);
		System.out.println("총합은 " + total +"입니다.");
	}

}
