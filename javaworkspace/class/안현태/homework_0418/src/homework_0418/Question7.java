package homework_0418;

import java.util.Scanner;

public class Question7 {
	public static void main(String args[]){
		double height, weight;
		double p_weight;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("성별을 입력하세요: ");
		s = sc.nextLine();
		System.out.print("키를 입력하세요 :");
		height = sc.nextDouble();
		System.out.print("몸무게를 입력하세요 :");
		weight = sc.nextDouble();
		
			
		if(s.equals("m")){
			p_weight = height - 100;	
			if(weight - p_weight > 5 )
				System.out.println("당신은 비만 입니다.");
			else if(weight - p_weight <= 5 && weight - p_weight > 0)
				System.out.println("당신은 표준체중 입니다.");
			else
				System.out.println("당신은 저체중입니다.");
		}
			
				
		else if(s.equals("f")){
			p_weight = height - 105;	
			if(weight - p_weight > 5 )
				System.out.println("당신은 비만 입니다.");
			else if(weight - p_weight <= 5 && weight - p_weight > 0)
				System.out.println("당신은 표준체중 입니다.");
			else
				System.out.println("당신은 저체중입니다.");
		}
		
		else
			System.out.println("잘못 입력하셨습니다");
		
		
 
	}
}
