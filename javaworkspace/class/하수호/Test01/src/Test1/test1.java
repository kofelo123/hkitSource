package Test1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		double score;
		int result;
		System.out.println("나이를 입력하세요");
		age=sc.nextInt();
		System.out.println("성적을 입력하세요");
		score=sc.nextDouble();
		
		if(age<30 && score<=3.5){
			System.out.println("추천대상입니다");
		}else {
			System.out.println("추천대상이 아닙니다");
		
		
		}
		{
			
		}
	}

}
