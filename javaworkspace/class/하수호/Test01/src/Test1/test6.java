package Test1;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int w;
		int h;
		int g;
		int r = 0;
		String x;
		System.out.println("�����Է�:1.����2.����");
		g= sc.nextInt();
		System.out.println("Ű�� �Է��ϼ���");
		h=sc.nextInt();
		System.out.println("�����Ը� �Է��ϼ���");
		w=sc.nextInt();
		
		if(1==g){
			r=h-100;
		}else if(2==g){
		r=h-105;
		}else{
			System.out.println("�߸��Է��߽��ϴ�");
		}
		if(r<(w+5)){
			System.out.println("���Դϴ�");
		}else if(r<w-5){
			System.out.println("�̴��Դϴ�");
		}else {
			System.out.println("ǥ���Դϴ�");
				
			}
	}

}
