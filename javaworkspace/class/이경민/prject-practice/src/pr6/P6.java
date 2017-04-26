package pr6;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int g=0, ti=0, rt=0;
		
		double wm = 0.0;
	
	
		final int wg1 = 20000;
		final int wg2 = 15000;
		
		System.out.println("직급은? ");
		g = sc.nextInt();
		
		System.out.println("시간은?");
		ti=sc.nextInt();
		
		if(g == 5 || g == 6) {
			rt = wg1;
			if(ti > 40){
				wm = (40 * rt)+((ti - 40) * rt * 1.5);
			} else {
			wm = 40 * rt;
			}
		
		}else if(g == 7 || g == 8){
			rt = wg2;
		    if(ti > 40){
				wm = (40 * rt)+((ti - 40) * rt * 1.5);
						
	   } else {
		    wm = 40 * rt;
		}
		
		}
		 System.out.println("주 급여는?"+wm);
	
	    	 
	    	
	    	
	    	
		
		
	
		
		
  }
	
}
