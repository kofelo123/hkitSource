package kr.hkit.Prob;

import java.util.Scanner;

public class FourProb {

	private int numb;

	public FourProb() {

		input();
		cal();
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���: ");
		numb = scanner.nextInt();
	}

	public void cal() {
		int count=0;
		System.out.print("�Է¹��� �������� �Ҽ��� :");
		for (int i = 2; i <= numb; i++) {//2���� numb���� ��������

			for (int j = 2; j <= i-1; j++) {//2���� i���� �˻�
				
				if ( i % j  == 0) {// �Ҽ���
					count++;
				}							
			}
			if(count==0)
			System.out.print(i + ", ");
			count=0;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourProb fourProb = new FourProb();
	}

}