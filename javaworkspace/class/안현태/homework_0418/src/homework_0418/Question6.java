package homework_0418;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		int zikgeb;
		int time;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직급 : ");
		zikgeb = sc.nextInt();
		System.out.print("근무시간 : ");
		time = sc.nextInt();
		
		switch (zikgeb) {
		case 7:
		case 8:
			if(time>=40){
				double realmoney = (40*15000) + ((time-40)*15000*1.5);
				System.out.println("주 급여 : "+ realmoney);
			}
			else 
				System.out.println("주 급여: "+ 40*15000);
			
			break;
		case 5:
		case 6:
			if(time>=40){
				double realmoney = (40*20000) + ((time-40)*20000*1.5);
				System.out.println("주 급여 : "+ realmoney);
			}
			else
				System.out.println("주 급여: "+ 40*20000);
			
			break;
		default:
			break;
		}

	}

}
