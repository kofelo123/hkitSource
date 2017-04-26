package test06;

import java.util.Scanner;

public class Test06 {
	
	public static void  main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a, time, temp;
		double pay=0;
		
		System.out.println("직급을 입력하세요");
		a = sc.nextInt();
		System.out.println("근무시간을 입력하세요");
		time = sc.nextInt();
		
	
		switch(a){
		case 7:
		case 8:
			if(time < 40)
				pay = (15000 * 40);
			else if(time > 40)
				pay = (15000 * 40) + (15000*(time-40))*1.5;
			break;
		case 5:
		case 6:
			if(time < 40)
				pay = (20000 * 40);
			else if(time > 40)
				pay = (20000 * 40) + (20000*(time-40))*1.5;
		}
		
		System.out.println("주 급여 : " + pay);
		
	}

}
