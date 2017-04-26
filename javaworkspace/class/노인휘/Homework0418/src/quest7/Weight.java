package quest7;

import java.util.Scanner;

public class Weight {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double weight;
		double height;
		double standard_weight = 0.0;
		String sex;
		String status;

		System.out.println("체중을 입력하세요");
		weight = scan.nextDouble();
		System.out.println("키를 입력하세요");
		height = scan.nextDouble();
		System.out.println("성별을 입력하세요 예)남 or 여");
		sex = scan.next();

		if (sex.equals("남")) {
			standard_weight = height - 100;
		} 
		else if (sex.equals("여")) {
			standard_weight = height - 105;
		}
		
		if (standard_weight - 5 > weight)
			status = "미달";
		else if (standard_weight + 5 <= weight)
			status = "초과";
		else
			status = "표준";

		System.out.println(status);
	}
}
