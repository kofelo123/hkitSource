package kr.hkit.homework;

import java.util.Scanner;

public class ThirdWork {
	Scanner scanner = new Scanner(System.in);
	String gender;
	int score;
	
	public void input(){
		System.out.print("������ �Է����ּ���: ");
		gender=scanner.nextLine();
		System.out.print("���������� �Է����ּ���: ");
		score=scanner.nextInt();
				
	}
	
	public void check(){
		
		if((gender.equals("����")&&score>=700) || (gender.equals("����")&&score>=800)){
			System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�.");
		}else{
			System.out.println("���հ��� �Դϴ�.");
		}
	}

	public static void main(String[] args) {
		ThirdWork thirdWork = new ThirdWork();
		thirdWork.input();
		thirdWork.check();
	}

}
