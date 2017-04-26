package homework3_3;

import java.util.*;

public class Homework3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("하나의 숫자를 입력하시오 : ");
		int user = sc.nextInt();
		for(int i= user; i>0; i--)
		{
			for(int j = 0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
