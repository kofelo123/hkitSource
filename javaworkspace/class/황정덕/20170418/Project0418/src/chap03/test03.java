package chap03;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t;
		String duk;
		System.out.print("���� �Է�(m,f) : ");
		duk=in.nextLine();
		System.out.print("���ͼ����� �Է��Ͻÿ� : ");
		t=in.nextInt();
		
		if(duk.equals("f")){
			if(t>=700){
				System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�");
			}else{
				System.out.println("���� �������� �ʽ��ϴ�");
			}
		}else if(duk.equals("m")){
			if(t>=800){
				System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�");
			}else{
				System.out.println("���� �������� �ʽ��ϴ�");
			}
		}else{
			System.out.println("���� �������� �ʽ��ϴ�");
		}
	}

}
