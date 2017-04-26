package pr2;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    int nu1,nu2;
		
		System.out.println("숫자는?");
		nu1=sc.nextInt();
	
		System.out.println("숫자는?");
		nu2=sc.nextInt();
		
		if(nu1%2==0 && nu2%2==0){
			System.out.println("모두짝수입니다.");
		} else if (nu1%2==1 && nu2%2==1){
			System.out.println("모두홀수입니다.");
		} else {
			System.out.println("뭣도 아닙니다.");
		}
			
	
			
	
		

	}

}
