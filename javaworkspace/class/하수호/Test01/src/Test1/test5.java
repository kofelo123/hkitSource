package Test1;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int time;
		int buy;
		double result = 0;
		double result2 = 0;
	
		System.out.println("���Խð��� �Է��ϼ���");
		time=sc.nextInt();
		System.out.println("�� ���Աݾ��� �Է��ϼ���");
		buy=sc.nextInt();
		
		if(time<12){
			result=buy-buy*0.05;
		
		}else if(time>12){
		result2=buy-buy*0.025;
				
			}
		if(time<12){
			System.out.println("���Խð�"+time);
			System.out.println("�� ���Աݾ�"+buy);
			System.out.println("�������ұݾ�"+result);
		}else if(time>12){
			System.out.println("����"+time);
			System.out.println("����"+buy);
			System.out.println("�Ǽ��ɾ�"+result2);
		
	}

}
}