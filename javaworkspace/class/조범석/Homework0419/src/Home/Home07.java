package Home;

import java.util.Scanner;

public class Home07 {

	public static void main(String[] args) {
	
		
		int i, sum=0, j=1;

		Scanner sc = new Scanner(System.in);
		 do
		 {	
			 System.out.print("숫자입력");
		     i = sc.nextInt();
		     
		  if(j%2==0)
		  {
		   i=-i;
		  }
		 sum=sum+i;

		 j=j+1;
		 
		 }while(j<=10);	 
	
		System.out.println("총합 : "+sum);
	}
}
