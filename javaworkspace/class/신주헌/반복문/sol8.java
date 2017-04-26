package housework;

import java.util.Scanner;

public class sol8 {
	public static void main(String[] args){
		
		int month=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("가장 좋아하는 월은?(종료:0)");
		System.out.println("---------------------");
		month = scan.nextInt();
		System.out.println("******"+month+"월******");
		do{
			if(month==12|| month==1||month==2){
				System.out.println(month+"월은 겨울에 해당됩니다");
			}
			else if(month==3|| month==4||month==5){
				System.out.println(month+"월은 봄에 해당됩니다");
			}
			else if(month==6|| month==7||month==8){
				System.out.println(month+"월은 여름에 해당됩니다");
			}
			else if(month==9|| month==10||month==11){
				System.out.println(month+"월은 가을에 해당됩니다");
			}
			if(month==0){
				System.out.println("종료");
				System.exit(0);
			}
			break;
		}while(true);
	}
}
