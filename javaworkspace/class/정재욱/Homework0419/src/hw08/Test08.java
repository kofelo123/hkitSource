package hw08;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		String season = "";
		
		do{
			System.out.println("====================");
			System.out.print("가장 좋아하는 월은?(종료:0)");
			int num=sc.nextInt();
			System.out.println("====================");
			if(num==0) {
				flag = false;
				break;
			}
			System.out.printf("****** %d월 ******\n", num);
			
			switch(num) {
			case 12: case 1: case 2:
				season = "겨울";
				break;
			case 3: case 4: case 5:
				season = "봄";
				break;
			case 6: case 7: case 8:
				season = "여름";
				break;
			case 9: case 10: case 11:
				season = "가을";
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
			System.out.println(num + "월은 " + season +"에 해당됩니다.");
			
			
		}while(flag);
		
	}
}
