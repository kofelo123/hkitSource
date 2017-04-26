package quiz6;

import java.util.Scanner;

public class quiz6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, gold; int b;// a:직급 b:시간 gold:급여
		System.out.print("직급:");
		a = sc.nextInt();
		if(a==7||a==8){
			System.out.print("근무 시간:");
			b = sc.nextInt();
			if(40<b){
				gold =(40*15000)+(b-40)*(15000/100*150);
				System.out.println(gold);
			}else if(b<=40){
				gold =40*15000; 
				System.out.println(gold);}}
			else if(a==6|| a==5){
				System.out.print("근무 시간:");
				b = sc.nextInt();
				if(40<b){
					gold =(40*20000)+(b-40)*(20000/100*150);
					System.out.println(gold);}
				else if(b<=b){
					gold=40*20000;
					System.out.println(gold);
				}
			}
		}
	}