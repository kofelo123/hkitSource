package for_moon;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하시오 : ");
		int input = sc.nextInt();
		int n = 1;
		int count = 0;

		for (int i = 2; i <= input; i++) {
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) 
					count++;    
			} //안쪽 for
				if (count == 2) {
				System.out.println(i);
				//count = 0; 여기있으면 count 초기화가 안됨(if문이니깐)
				} 
				count = 0;
			
				
		} // 바깥for

	}
}
