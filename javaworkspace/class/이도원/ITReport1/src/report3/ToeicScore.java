package report3;

import java.util.Scanner;

public class ToeicScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char sex;
		int toeic_score;
		String pass_status="";
		
		
		System.out.println("������ �Է��� �ּ���. M(m) or F(f)");
		System.out.print("==> ");
		sex = scan.next().charAt(0);
		System.out.println("���� ������ �Է��� �ּ���.");
		System.out.print("==> ");
		toeic_score = scan.nextInt();
		
		if(sex == 'F' || sex == 'f'){
			if(toeic_score >= 700){
				pass_status = "������";
			}
			else {
				pass_status = "�Ұ�����";
			}
		}
		else if (sex == 'M' || sex == 'm'){
			if(toeic_score >= 800){
				pass_status = "������";
						
			}
			else {
				pass_status = "�Ұ�����";
			}
		}
		
		System.out.println("\n�װ� �¹��� ���� �ڰ� " + pass_status + "�Դϴ�.");
	}

}
