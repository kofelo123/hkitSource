package chap03;

import java.util.Scanner;

public class test00 {

	public static void main(String[] args) {
	    int toeic;
	    String gender;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("���� �Է�");
	    gender = sc.nextLine();
	    System.out.print("���� ���� �Է�");
	    toeic = sc.nextInt();
	    
	    if(gender=="����" &&toeic>=700 || gender=="����" &&toeic>=800)
	 
	    	System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�");
else{
	    	System.out.println("�װ� �¹��� ���� �ڰ� �����ڰ� �ƴմϴ�");
	    }

	}

}
