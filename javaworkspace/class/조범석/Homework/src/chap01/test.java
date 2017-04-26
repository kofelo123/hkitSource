package chap01;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	    int age, score;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("나이 입력");
	    age = sc.nextInt();
	    System.out.print("성적 입력");
	    score = sc.nextInt();
	    
	    if(age<30 && score>=3.5)
	    {
	    	System.out.println("추천 대상입니다.");
	    }
	    else
	    {
	    	System.out.println("추천 대상이 아닙니다.");
	    }

	}

}
