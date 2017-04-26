package qiz6;

import java.util.Scanner;

public class qiz6 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int i=0;
		int j;
		System.out.println("원하는 구구단을 입력하세요.");
		j= sc.nextInt();
		do{i=j;
		for(i=j; i>0; i=i-2){
	System.out.println(i+"X"+j+"="+i*j);}
		}while(i<0);
	}
}