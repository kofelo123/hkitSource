package homework2_6;

import java.util.*;

public class Homework2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 8,user = 0, result = 0;
		System.out.print("����� �Է� : ");
		user = sc.nextInt();
		System.out.println("** "+user+"�� **");
		do
		{
			result = i*user;
			System.out.println(i+" * "+user+" = "+result);
			i -= 2;
		}while(i>1);
	}

}
