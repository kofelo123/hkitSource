package Home;

import java.util.Scanner;

public class Home06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i, j=8;

		System.out.print("���� �Է�");
	    i = sc.nextInt();
	 
        System.out.println("����� �Է�: " +i);
	 

		System.out.println("** " +i+ "�� **");

	    do
		{
	    System.out.println(j+" * "+i+" = "+j*i);	 

	    j=j-2;	 
		}while(j>=2);
			 
	 }
}
	

