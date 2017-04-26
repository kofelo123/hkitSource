package homework2_7;

import java.util.*;

public class Homework2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0, sum = 0,user = 0;
		do
		{
			System.out.print("정수를 입력하시오 : ");
			user = sc.nextInt();
			if(i%2 == 1)
				user = -1*user;
			sum += user;
			i++;
		}while(i<10);

		System.out.println("정수들의 총합은 : "+sum);
	}

}
