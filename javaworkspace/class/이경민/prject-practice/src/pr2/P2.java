package pr2;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    int nu1,nu2;
		
		System.out.println("���ڴ�?");
		nu1=sc.nextInt();
	
		System.out.println("���ڴ�?");
		nu2=sc.nextInt();
		
		if(nu1%2==0 && nu2%2==0){
			System.out.println("���¦���Դϴ�.");
		} else if (nu1%2==1 && nu2%2==1){
			System.out.println("���Ȧ���Դϴ�.");
		} else {
			System.out.println("���� �ƴմϴ�.");
		}
			
	
			
	
		

	}

}
