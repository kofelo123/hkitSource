package Home;

import java.util.Scanner;

public class Home05 {

	public static void main(String[] args) {
	
	int i, sum=0, j=3;
	
	Scanner sc = new Scanner(System.in);
		
	 System.out.print("���� �Է�");
     i = sc.nextInt();
	 
	 System.out.println("����� �Է� : "+i);

	 do
	 {
	  sum = sum + j;
	  j = j + 3;
	 }while(j <= i);

	 System.out.println(i+"�� �Ѿ��� ���� �� : "+j);
	 System.out.println(i+ "�� �Ѿ��� �������� ���հ� : "+sum);
	}

}
