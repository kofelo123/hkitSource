package report3;

import java.util.Scanner;

public class ToeicScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char sex;
		int toeic_score;
		String pass_status="";
		
		
		System.out.println("성별을 입력해 주세요. M(m) or F(f)");
		System.out.print("==> ");
		sex = scan.next().charAt(0);
		System.out.println("토익 점수를 입력해 주세요.");
		System.out.print("==> ");
		toeic_score = scan.nextInt();
		
		if(sex == 'F' || sex == 'f'){
			if(toeic_score >= 700){
				pass_status = "가능자";
			}
			else {
				pass_status = "불가능자";
			}
		}
		else if (sex == 'M' || sex == 'm'){
			if(toeic_score >= 800){
				pass_status = "가능자";
						
			}
			else {
				pass_status = "불가능자";
			}
		}
		
		System.out.println("\n항공 승무원 지원 자격 " + pass_status + "입니다.");
	}

}
