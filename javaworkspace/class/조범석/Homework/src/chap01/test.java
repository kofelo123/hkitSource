package chap01;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	    int age, score;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("���� �Է�");
	    age = sc.nextInt();
	    System.out.print("���� �Է�");
	    score = sc.nextInt();
	    
	    if(age<30 && score>=3.5)
	    {
	    	System.out.println("��õ ����Դϴ�.");
	    }
	    else
	    {
	    	System.out.println("��õ ����� �ƴմϴ�.");
	    }

	}

}
