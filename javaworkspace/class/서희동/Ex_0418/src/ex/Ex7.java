package ex;

import java.util.Scanner;

public class Ex7 {
//비교연산자 >,<,=, and=&&, or=||
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int gender;
		String s;
		int height;
		int weight;
		
		System.out.println("성별 : 1.남자 2.여자 ");
		/*s=sc.nextLine();*/
		gender=sc.nextInt();
		System.out.println("키 : ");
		height = sc.nextInt();
		System.out.println("몸무게 : ");
		weight = sc.nextInt();
		
		if(gender==1){
			if((weight-(height-100))<-5){				
				System.out.println("미달");
			}else if((weight-(height-100))>=5){
				System.out.println("초과");
			}else if(5<=(weight-(height-100)) && (weight-(height-100))<5){//&&넣어서해야한다.
				System.out.println("표준");		
			}
		}else if(gender==2){
			if((weight-(height-105))<-5){
				System.out.println("미달");
			}else if((weight-(height-105))>=5){
				System.out.println("초과");
			}else if(5<=(weight-(height-105)) && (weight-(height-105))<5){//&&넣어서해야한다.
				System.out.println("표준");		
			}
		}
		
		/*if(s=="남자"){
			if((weight-(height-100))<-5){				
				System.out.println("미달");
			}else if((weight-(height-100))>=5){
				System.out.println("초과");
			}else if(5<=(weight-(height-100)) && (weight-(height-100))<5){//&&넣어서해야한다.
				System.out.println("표준");		
			}
		}else if(s=="여자"){
			if((weight-(height-105))<-5){
				System.out.println("미달");
			}else if((weight-(height-105))>=5){
				System.out.println("초과");
			}else if(5<=(weight-(height-105)) && (weight-(height-105))<5){//&&넣어서해야한다.
				System.out.println("표준");		
			}
		}*/
	}

}