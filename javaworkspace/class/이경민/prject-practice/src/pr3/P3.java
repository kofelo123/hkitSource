package pr3;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tg;
		
		int mf;
		
		System.out.println("������?(1:����. 2:����)");
		
		mf = sc.nextInt();
		
		System.out.println("������?");
		
		tg = sc.nextInt();
		
		if((mf==1)&&(tg>=800)) {
		
		System.out.println("�װ��¹��� �ڰ� �������Դϴ�."); }
		 
	    else if ((mf== 2 && tg>=700)) {
			
	    System.out.println("�װ��¹��� �ڰ� �������Դϴ�."); }
		
	    else 
	    	System.out.println("Ż��");
		
	 	
		

	}

}
