package Home;

import java.util.Scanner;

public class Home03 {

	public static void main(String[] args) {
		int i=0, sum=0, j=1;

		Scanner sc = new Scanner(System.in);
		 do
		 {

		   System.out.print("���� �Է�");
	       i = sc.nextInt();
		 
		  if(i>0)
		  {
		   sum=sum+i;
		   j=j+1;
		  }

		 } while(j<=10);

	     System.out.println("��: "+sum);

		 System.out.println("���: "+sum/10);
	}
}

