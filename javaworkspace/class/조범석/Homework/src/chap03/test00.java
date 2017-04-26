package chap03;

import java.util.Scanner;

public class test00 {

	public static void main(String[] args) {
	    int toeic;
	    String gender;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("성별 입력");
	    gender = sc.nextLine();
	    System.out.print("토익 성적 입력");
	    toeic = sc.nextInt();
	    
	    if(gender=="여자" &&toeic>=700 || gender=="남자" &&toeic>=800)
	 
	    	System.out.println("항공 승무원 지원 자격 가능자입니다");
else{
	    	System.out.println("항공 승무원 지원 자격 가능자가 아닙니다");
	    }

	}

}
