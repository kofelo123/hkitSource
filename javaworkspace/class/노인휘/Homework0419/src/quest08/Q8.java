package quest08;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int select=0;
		
		do{
			System.out.println("========================");
			System.out.println("가장 좋아하는 월은?(종료:0)");
			System.out.println("========================");
			
			select=scan.nextInt();
			
			switch(select){
			
			case 12:
			case 1:
			case 2:
				System.out.println(select+"월은 겨울입니다.");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(select+"월은 봄입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(select+"월은 여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(select+"월은 가을입니다");
				break;
			case 0:
				return;
			default:
				System.out.println("잘못입력했습니다.");
				break;		
			}
			
		}while(true);		
	}
}
