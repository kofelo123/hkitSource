package homework_0418;

import java.util.Scanner;

public class Question1{

	public static void main(String[] args) {
		int age;
		double hakzum;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��Ͻÿ� : ");
		age = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		hakzum = sc.nextDouble();
		
		if(age<30 && hakzum >=3.5)
			System.out.println("��õ ����Դϴ�");
		else
			System.out.println("��õ ����� �ƴմϴ�");
	}

}
