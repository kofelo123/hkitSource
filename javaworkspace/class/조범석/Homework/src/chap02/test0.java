package chap02;

import java.util.Scanner;

public class test0 {

	public static void main(String[] args) {
	    int num1, num2;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("첫번째 수");
	    num1 = sc.nextInt();
	    System.out.print("두번째 수");
	    num2 = sc.nextInt();
	    
	    if(num1%2==0 && num2%2==0 || num1%2==1 && num2%2==1)
	    {
	    	System.out.println("두 숫자는 같은 짝수 또는 홀수입니다");
	    }
	    else
	    {
	    	System.out.println("두 숫자는 같은 짝수 또는 홀수가 아닙니다");
	    }

	}

}