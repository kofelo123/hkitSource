package chap01;

import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		 
		int time=0;
		int amount=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���Žð� �Է� : ");
		time=sc.nextInt();
		System.out.println("���űݾ� �Է� : ");
		amount=sc.nextInt();
		
		if (time < 12){
		System.out.println(amount * 0.95);
	} else {
		System.out.println(amount * 0.975);

	}

	}
}
