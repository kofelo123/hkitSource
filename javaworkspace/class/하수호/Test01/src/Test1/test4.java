package Test1;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int money;
		double result = 0;
		double result2 =0 ;
		
		System.out.println("������ �Է��ϼ���1.7��8��,2.5��6��");
		a=sc.nextInt();
		
		System.out.println("������ �Է��ϼ���");
		money=sc.nextInt();
		
		if(1==a){
			result=money-money*0.08;
		}else if(2==a){
		result2=money-money*0.12;
		}
		

		if(1==a){
			System.out.println("����"+a);
			System.out.println("����"+money);
			System.out.println("�Ǽ��ɾ�"+result);
		}else if(2==a){
			System.out.println("����"+a);
			System.out.println("����"+money);
			System.out.println("�Ǽ��ɾ�"+result2);
		}else {
			System.out.println("ǥ���Դϴ�");
				
			}
	}

}

