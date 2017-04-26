package chap08;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=1,b=0;
		
		do{
			System.out.print("가장 좋아하는 달은?(종료0): ");
			a=in.nextInt();
			switch(a){
			case 0:
				System.out.println("******종료합니다******");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("******"+a+"******");
				System.out.println(a+"월은 봄에 해당됩니다");
				continue;
			case 6:
			case 7:
			case 8:
				System.out.println("******"+a+"******");
				System.out.println(a+"월은 여름에 해당됩니다");
				continue;
			case 9:
			case 10:
			case 11:
				System.out.println("******"+a+"******");
				System.out.println(a+"월은 가을에 해당됩니다");
				continue;
			case 1:
			case 2:
			case 12:
				System.out.println("******"+a+"******");
				System.out.println(a+"월은 겨울에 해당됩니다");
				continue;
			default:
				System.out.println("******"+a+"******");
				System.out.println(a+"월은 없습니다");
				continue;
			}
		}while(a!=0);
	}

}
