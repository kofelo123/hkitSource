package homework1_1;

import java.util.*;

public class Homework1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double grade;
		int age;
		System.out.println("나이를 입력하시오");
		age = sc.nextInt();
		System.out.println("성적을 입력하시오");
		grade = sc.nextDouble();
		
		if(age < 30  && grade >= 3.5)
			System.out.println("추천 대상입니다.");
		else
			System.out.println("추천 대상이 아닙니다.");
	}

}
