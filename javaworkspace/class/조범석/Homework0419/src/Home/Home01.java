package Home;

import java.util.Scanner;

public class Home01 {

	public static void main(String[] args) {
		
		 int i, sum=0, j=0;
		 Scanner sc = new Scanner(System.in);

		 System.out.print("���� �Է�");
         i = sc.nextInt();
	 
		 do
		 {
		  sum=sum+j;
		  j=j+1; 

		 } while(j <= i);

		System.out.println(i+"���� 1������ ��:" +sum);
	}
}
