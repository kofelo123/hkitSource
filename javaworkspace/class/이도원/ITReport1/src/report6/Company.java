package report6;

import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int basic_salary_78 = 600000;
		final int basic_salary_56 = 800000;
		
		int rank, work_time;
		int salary=0;
		
		System.out.println("������ �Է����ּ���.(5~8)");
		System.out.print("==> ");
		rank = scan.nextInt();
		
		System.out.println("�ٹ� �ð��� �Է����ּ���.");
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
			System.out.println("������ �ٽ� ������ �ּ���.");
		}
		
		System.out.println("\n���� : " + rank + "��");
		System.out.println("�ٹ� �ð� : " + work_time + "�ð�");
		System.out.println("�� �޿� : " + salary);
		
	}
}
