package chap02;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		System.out.print("ù��° ���� �Է� : ");
		a=in.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		b=in.nextInt();
		if((a%2)==0&&(b%2)==0){
			System.out.println("�Ѵ� �A��");
		}else if((a%2)==1&&(b%2)==1){
			System.out.println("�Ѵ� Ȧ��");
		}
		System.out.println("�Ѵ� ¦�� �Ǵ� �Ѵ� Ȧ�� �ƴ�");
	}

}
