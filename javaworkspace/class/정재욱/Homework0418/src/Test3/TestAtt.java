package Test3;

import java.util.Scanner;

public class TestAtt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력하세요(남자/여자) : ");
		String gender = sc.nextLine();
		System.out.print("토익 성적을 입력하세요 : ");
		int toeic = sc.nextInt();
		
		if((gender.equals("여자") && toeic>=700) || (gender.equals("남자") && toeic>=800)) {
			System.out.println("항공 승무원 지원 자격 가능자입니다.");
		} else {
			System.out.println("승무원 자격이 없습니다.");
		}
	}

}
