package kr.hkit.array;

import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int[] score = new int[15];
		int count = 0, sum = 0;
		
		String[] name={"�豺","�̱�","�㱺","�ڱ�","Ȳ��"};

		for (int i = 0; i < score.length; i++) {// �Է�
			System.out.print("�����Է�(5���� ������):");
			score[i] = scanner.nextInt();

			if (score[i] == -1)
				break;
		}

		System.out.println("     �̸�  ��   ��    ��     ��    ��");
		System.out.println("-------------------------");
		for (int i = 1; i < 6; i++) {
			System.out.print(i + ".");
			System.out.print(name[i-1]+" ");

			for (int j = 0; j < 3; j++) {
				System.out.print(score[count]+" ");
				sum += score[count];
				count++;
				if (j == 2) {
					System.out.print(sum+" ");
					System.out.print(sum / 3);
				}
				
			}
			System.out.println();
			sum = 0;

		}
	}

}