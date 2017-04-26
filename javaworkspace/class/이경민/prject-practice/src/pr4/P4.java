package pr4;

import java.util.Scanner;

public class P4 {

public static void main(String[] args) {
		
		int grade=0,gold=0;
		double realrate=0.0, realgold = 0.0;
		final double rate78=0.08;
		final double rate56=0.12;
		
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
		System.out.println("직급 : ");
        grade = sc.nextInt();
        
        System.out.println("본봉 : ");
        gold = sc.nextInt();
        
        
        if(grade==7 || grade==8) {
        	realrate = rate78;
        	
        }else if (grade == 5 || grade == 6 ) {
        		
        	realrate = rate56;
        		
        	}else {
        		flag = false;
        	}
        	
        if(flag){
        
	    realgold = gold - (gold*realrate);
	   
	   System.out.println("실수령액은?" +realgold);
	   
	}else {
	   System.out.println("error");
	}
		}
		
		} 
	}
