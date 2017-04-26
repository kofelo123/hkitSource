package homework2_5;

import java.util.*;

public class Homework2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int three = 0, sum = 0, over = 0, user = 0;
		int num = 1;// (3)몇 배수인가
		System.out.println("사용자 입력 : ");
		user = sc.nextInt();
		do
		{
			three = num*3;
			sum += three;
			num++;
		}while(three<user);
//		over = 3*num;
		System.out.println(user+"을 넘었을 때의 값 : "+three);
		System.out.println(user+"을 넘었을 때까지의 총합계 : "+(sum-three));
		System.out.println(user+"을 넘었을 때까지 몇 번째 3의 배수인가 : "+three/3);
		
	}

}
