package kr.hkit.homework;

import java.util.Scanner;

public class ThirdWork {
	Scanner scanner = new Scanner(System.in);
	String gender;
	int score;
	
	public void input(){
		System.out.print("성별을 입력해주세요: ");
		gender=scanner.nextLine();
		System.out.print("토익점수를 입력해주세요: ");
		score=scanner.nextInt();
				
	}
	
	public void check(){
		
		if((gender.equals("여자")&&score>=700) || (gender.equals("남자")&&score>=800)){
			System.out.println("항공 승무원 지원 자격 가능자입니다.");
		}else{
			System.out.println("불합격자 입니다.");
		}
	}

	public static void main(String[] args) {
		ThirdWork thirdWork = new ThirdWork();
		thirdWork.input();
		thirdWork.check();
	}

}
