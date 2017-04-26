package homework1_3;

import java.util.*;

public class Homework1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String sex;
		int grade;
		
		System.out.println("성별을 입력하시오");
		sex = sc.nextLine();
		System.out.println("토익점수를 입력하시오.");
		grade = sc.nextInt();
		
		if((sex.charAt(0) == 'F' || sex.charAt(0) == 'f') && grade >= 700)
			System.out.println("항공 승무원 지원 자격 가능자입니다.");
		else if((sex.charAt(0) == 'M' || sex.charAt(0) == 'm') && grade >= 800)
			System.out.println("항공 승무원 지원 자격 가능자입니다.");
		else
			System.out.println("항공 승무원 지원 자격 가능자가 아닙니다.");
		
	}

}
