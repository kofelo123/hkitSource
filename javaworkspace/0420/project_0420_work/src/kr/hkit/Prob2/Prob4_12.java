package kr.hkit.Prob2;

public class Prob4_12 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {//2~9 ��
			for (int count = 1; count <= 3; count++) {//1~3   + 3�ٰ���
				for (int j = 2; j <= 4; j++) {//���ٴ� 3��
					System.out.print(i + "*" + count + "=" + i * count + "\t");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
	}
}
