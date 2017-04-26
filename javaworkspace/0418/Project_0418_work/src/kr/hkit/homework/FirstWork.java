package kr.hkit.homework;

import java.util.Scanner;

public class FirstWork {
	Scanner scanner = new Scanner(System.in);
	int age;
	double score;
	
	public void input(){
		System.out.print("나이를 입력해주세요: ");
		age=scanner.nextInt();
		System.out.print("점수를 입력해주세요: ");
		score=scanner.nextDouble();
	}
	
	public void check(){
		if((age<30) && (score>=3.5)){
			System.out.println("추천대상입니다.");
		}else{
			System.out.println("추천대상이 아닙니다.");
		}
	}

	public static void main(String[] args) {
		FirstWork firstWork = new FirstWork();
		firstWork.input();
		firstWork.check();
	}

}
