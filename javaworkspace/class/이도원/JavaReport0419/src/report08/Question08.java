package report08;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input_number;
		String msg = "";
		
		while(true){
			System.out.println("==========================");
			System.out.println("가장 좋아하는 월은?(종료:0)");
			System.out.println("==========================");
			System.out.print("==> ");
			
			input_number = scan.nextInt();
			
			System.out.println("*****" + input_number + "월 *****");
			
			switch(input_number){
			case 12:
			case 1:
			case 2:
				System.out.println(input_number + "월은 겨울입니다.\n");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(input_number + "월은 봄입니다.\n");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(input_number + "월은 여름입니다.\n");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(input_number + "월은 가을입니다.\n");
				break;
			case 0:
				System.out.println("종료 되었습니다.");
				return;
			default:
				System.out.println("0~12사이의 수를 입력해 주세요.\n");
				break;	
			}
		}
		
	}

}
