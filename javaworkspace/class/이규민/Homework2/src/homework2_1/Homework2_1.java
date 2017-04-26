package homework2_1;

import java.util.*;

public class Homework2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("하나의 숫자를 입력하시오");
		
		int i = 0, sum = 0;
		i = sc.nextInt();
		do
		{
			sum += i;
			i--;
		}while(i>0);
		System.out.println(sum);
	}

}
