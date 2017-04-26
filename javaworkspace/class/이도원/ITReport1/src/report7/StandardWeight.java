package report7;

import java.util.Scanner;

public class StandardWeight {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		double weight, height;
		double standard_weight=0.0;
		char sex;
		String condition="";
		
		
		System.out.print("몸무게 : ");
		weight = scan.nextDouble();
		System.out.print("키 : ");
		height = scan.nextDouble();
		System.out.print("성별[M(m) or F(f)] : ");
		sex = scan.next().charAt(0);
		
		
		if(sex == 'M' || sex == 'm'){
			standard_weight = height - 100;
		}
		else if(sex == 'F' || sex == 'f') {
			standard_weight = height - 105;
		}
		
		
		if(weight < standard_weight-5){
			condition = "미달입니다.";
		}
		else if(weight >= standard_weight-5 && weight < standard_weight+5){
			condition = "표준입니다.";
		}
		else {
			condition = "초과하였습니다.";
		}
		
		System.out.println("현재 당신의 상태는 " + condition);
	}
}
