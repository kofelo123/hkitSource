package pr3;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tg;
		
		int mf;
		
		System.out.println("성별은?(1:남자. 2:여자)");
		
		mf = sc.nextInt();
		
		System.out.println("점수는?");
		
		tg = sc.nextInt();
		
		if((mf==1)&&(tg>=800)) {
		
		System.out.println("항공승무원 자격 가능자입니다."); }
		 
	    else if ((mf== 2 && tg>=700)) {
			
	    System.out.println("항공승무원 자격 가능자입니다."); }
		
	    else 
	    	System.out.println("탈락");
		
	 	
		

	}

}
