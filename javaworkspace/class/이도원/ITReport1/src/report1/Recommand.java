package report1;

import java.util.Scanner;

public class Recommand {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int age;
		double grade;
		
		System.out.println("���̸� �Է��ϼ���.");
		System.out.print("=> ");
		age = scan.nextInt();
		
		System.out.println("������ �Է��ϼ���.");
		System.out.print("=> ");
		grade = scan.nextDouble();
		
		if(age < 30 && grade >= 3.5){
			System.out.println("\n��õ ����Դϴ�.");
		}
		else {
			System.out.println("\n��õ ����� �ƴմϴ�.");
		}

	}

}
