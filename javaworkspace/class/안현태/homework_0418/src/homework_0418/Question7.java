package homework_0418;

import java.util.Scanner;

public class Question7 {
	public static void main(String args[]){
		double height, weight;
		double p_weight;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		s = sc.nextLine();
		System.out.print("Ű�� �Է��ϼ��� :");
		height = sc.nextDouble();
		System.out.print("�����Ը� �Է��ϼ��� :");
		weight = sc.nextDouble();
		
			
		if(s.equals("m")){
			p_weight = height - 100;	
			if(weight - p_weight > 5 )
				System.out.println("����� �� �Դϴ�.");
			else if(weight - p_weight <= 5 && weight - p_weight > 0)
				System.out.println("����� ǥ��ü�� �Դϴ�.");
			else
				System.out.println("����� ��ü���Դϴ�.");
		}
			
				
		else if(s.equals("f")){
			p_weight = height - 105;	
			if(weight - p_weight > 5 )
				System.out.println("����� �� �Դϴ�.");
			else if(weight - p_weight <= 5 && weight - p_weight > 0)
				System.out.println("����� ǥ��ü�� �Դϴ�.");
			else
				System.out.println("����� ��ü���Դϴ�.");
		}
		
		else
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		
		
 
	}
}
