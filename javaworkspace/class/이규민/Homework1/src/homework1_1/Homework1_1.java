package homework1_1;

import java.util.*;

public class Homework1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double grade;
		int age;
		System.out.println("���̸� �Է��Ͻÿ�");
		age = sc.nextInt();
		System.out.println("������ �Է��Ͻÿ�");
		grade = sc.nextDouble();
		
		if(age < 30  && grade >= 3.5)
			System.out.println("��õ ����Դϴ�.");
		else
			System.out.println("��õ ����� �ƴմϴ�.");
	}

}
