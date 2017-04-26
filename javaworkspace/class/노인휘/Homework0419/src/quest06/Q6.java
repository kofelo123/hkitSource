package quest06;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int dan = 0;
		int even = 8;
		
		System.out.println("사용자 입력: ");
		dan=scan.nextInt();
		
		do{
			System.out.println(even+"*"+dan+"="+even*dan);
			even-=2;

		}while(even>=2);
		
		
	}

}
