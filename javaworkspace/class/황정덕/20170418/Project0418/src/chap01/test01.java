package chap01;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		double b;
		System.out.print("���̸� �Է��Ͻÿ� : ");
		a=in.nextInt();
		System.out.print("������ �Է��Ͻÿ� : ");
		b=in.nextDouble();
		if(a<30&&b>3.5){
			System.out.println("��õ ����Դϴ�");
		}else{
			System.out.println("��õ ����� �ƴմϴ�");			
		}
		
	}

}
