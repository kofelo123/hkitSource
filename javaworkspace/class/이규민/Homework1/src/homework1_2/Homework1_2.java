package homework1_2;

import java.util.*;

public class Homework1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num_1, num_2;
		System.out.println("두 개의 숫자를 입력하시오.");
		num_1 = sc.nextInt();
		num_2 = sc.nextInt();
		
		if(num_1%2 == num_2%2)
			System.out.println("두 숫자는 같은 짝수 또는 홀수입니다.");
		else
			System.out.println("두 숫자는 같은 짝수 또는 홀수가 아닙니다.");
		
	}

}
