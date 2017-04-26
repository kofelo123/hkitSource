package Home;

import java.util.Scanner;

public class Home03 {

	public static void main(String[] args) {
		int i=0, sum=0, j=1;

		Scanner sc = new Scanner(System.in);
		 do
		 {

		   System.out.print("숫자 입력");
	       i = sc.nextInt();
		 
		  if(i>0)
		  {
		   sum=sum+i;
		   j=j+1;
		  }

		 } while(j<=10);

	     System.out.println("합: "+sum);

		 System.out.println("평균: "+sum/10);
	}
}

