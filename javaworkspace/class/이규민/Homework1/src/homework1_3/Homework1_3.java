package homework1_3;

import java.util.*;

public class Homework1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String sex;
		int grade;
		
		System.out.println("������ �Է��Ͻÿ�");
		sex = sc.nextLine();
		System.out.println("���������� �Է��Ͻÿ�.");
		grade = sc.nextInt();
		
		if((sex.charAt(0) == 'F' || sex.charAt(0) == 'f') && grade >= 700)
			System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�.");
		else if((sex.charAt(0) == 'M' || sex.charAt(0) == 'm') && grade >= 800)
			System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�.");
		else
			System.out.println("�װ� �¹��� ���� �ڰ� �����ڰ� �ƴմϴ�.");
		
	}

}
