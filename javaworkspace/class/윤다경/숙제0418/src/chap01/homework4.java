package chap01;

import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		
		int level=0;
		int money=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		level=sc.nextInt();
		System.out.println("���� �Է� : ");
		money=sc.nextInt();
				
	if ((level==7) && (level==8)){
			System.out.println(money * 0.92);
	}else{
		    System.out.println(money * 0.88);

		}

	}

}
