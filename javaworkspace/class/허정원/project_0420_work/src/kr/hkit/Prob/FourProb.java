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
		System.out.print("숫자를 입력해주세요: ");
		numb = scanner.nextInt();
	}

	public void cal() {
		int count=0;
		System.out.print("입력받은 값까지의 소수는 :");
		for (int i = 2; i <= numb; i++) {//2부터 numb까지 숫자지정

			for (int j = 2; j <= i-1; j++) {//2부터 i까지 검사
				
				if ( i % j  == 0) {// 소수면
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
