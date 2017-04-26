package Home;

import java.util.Scanner;

public class Home06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i, j=8;

		System.out.print("숫자 입력");
	    i = sc.nextInt();
	 
        System.out.println("사용자 입력: " +i);
	 

		System.out.println("** " +i+ "단 **");

	    do
		{
	    System.out.println(j+" * "+i+" = "+j*i);	 

	    j=j-2;	 
		}while(j>=2);
			 
	 }
}
	

