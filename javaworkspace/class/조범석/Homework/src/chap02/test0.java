package chap02;

import java.util.Scanner;

public class test0 {

	public static void main(String[] args) {
	    int num1, num2;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("ù��° ��");
	    num1 = sc.nextInt();
	    System.out.print("�ι�° ��");
	    num2 = sc.nextInt();
	    
	    if(num1%2==0 && num2%2==0 || num1%2==1 && num2%2==1)
	    {
	    	System.out.println("�� ���ڴ� ���� ¦�� �Ǵ� Ȧ���Դϴ�");
	    }
	    else
	    {
	    	System.out.println("�� ���ڴ� ���� ¦�� �Ǵ� Ȧ���� �ƴմϴ�");
	    }

	}

}