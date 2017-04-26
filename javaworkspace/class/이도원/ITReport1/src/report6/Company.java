package report6;

import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int basic_salary_78 = 600000;
		final int basic_salary_56 = 800000;
		
		int rank, work_time;
		int salary=0;
		
		System.out.println("직급을 입력해주세요.(5~8)");
		System.out.print("==> ");
		rank = scan.nextInt();
		
		System.out.println("근무 시간을 입력해주세요.");
		System.out.print("==> ");
		work_time = scan.nextInt();
		
		if(rank >= 5 && rank < 9){
			if(rank == 7 || rank == 8){
				if(work_time <= 40){
					salary = basic_salary_78;
				}
				else {
					salary = basic_salary_78 + (15000*(work_time-40)*15/10);
				}
			}
			else {
				if(work_time <= 40){
					salary = basic_salary_56;
				}
				else {
					salary = basic_salary_56 + (20000*(work_time-40)*15/10);
				}
			}
		}
		else {
			System.out.println("직급을 다시 선택해 주세요.");
		}
		
		System.out.println("\n직급 : " + rank + "급");
		System.out.println("근무 시간 : " + work_time + "시간");
		System.out.println("주 급여 : " + salary);
		
	}
}
