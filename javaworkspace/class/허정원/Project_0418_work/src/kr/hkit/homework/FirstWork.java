package kr.hkit.homework;

import java.util.Scanner;

public class FirstWork {
	Scanner scanner = new Scanner(System.in);
	int age;
	double score;
	
	public void input(){
		System.out.print("���̸� �Է����ּ���: ");
		age=scanner.nextInt();
		System.out.print("������ �Է����ּ���: ");
		score=scanner.nextDouble();
	}
	
	public void check(){
		if((age<30) && (score>=3.5)){
			System.out.println("��õ����Դϴ�.");
		}else{
			System.out.println("��õ����� �ƴմϴ�.");
		}
	}

	public static void main(String[] args) {
		FirstWork firstWork = new FirstWork();
		firstWork.input();
		firstWork.check();
	}

}
