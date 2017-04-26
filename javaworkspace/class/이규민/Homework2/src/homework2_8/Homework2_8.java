package homework2_8;

import java.util.*;

public class Homework2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int user = 0;
		do
		{
			System.out.println("============================");
			System.out.println("가장 좋아하는 월은?(종료:0)");
			System.out.println("=============================");
			user = sc.nextInt();
			if(user == 0)
				break;
			else if(user<3)
			{
				System.out.println("******* "+user+"월 ******");
				System.out.println(user+"월은 겨울에 해당됩니다.");
			}
			else if(user<6)
			{
				System.out.println("******* "+user+"월 ******");
				System.out.println(user+"월은 봄에 해당됩니다.");
			}
			else if(user<9)
			{
				System.out.println("******* "+user+"월 ******");
				System.out.println(user+"월은 여름에 해당됩니다.");
			}
			else if(user<12)
			{
				System.out.println("******* "+user+"월 ******");
				System.out.println(user+"월은 가을에 해당됩니다.");
			}
			else if(user==12)
			{
				System.out.println("******* "+user+"월 ******");
				System.out.println(user+"월은 겨울에 해당됩니다.");
				
			}
			else 
			{
				System.out.println("입력이 잘못되었습니다.");
			}
		}while(true);
	}

}
