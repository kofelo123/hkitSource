package homework3_4;

import java.util.*;

public class Homework3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("하나의 숫자를 입력하시오 : ");
		int num = 0, user = sc.nextInt();
		int first = 0;
		int count = 0;
		for(int i=2; i<=user; i++)
		{
			num  = 0;
			for(int j=2; j<=i; j++)
			{
				if(i%j == 0)
					num++;
			}
			if(num == 1 && first == 0){
				System.out.print(i);
				count++;
				first++;
			}
			else if(num == 1){
				System.out.print(", "+i);
				count++;
			}

		}
		sc.close();
	}

}
