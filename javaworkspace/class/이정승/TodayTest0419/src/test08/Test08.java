package test08;

import java.util.Scanner;

public class Test08 {
	public static void main(String [] args){
		//월을 입력받아 해당하는 계절을 출력
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do
		{
			System.out.println("계절을 알고싶은 월을 입력하세요 : (종료는 0)");
			num = sc.nextInt();
			switch(num){
			case 3:
			case 4:
			case 5:
				System.out.println("봄 입니다");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름 입니다");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("가을 입니다");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("겨울 입니다");
				break;
			default :
				break;
			}
		}while(num != 0);
	}
}
