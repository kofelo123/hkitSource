package chap04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=1;
		int sum=0;
		do{
			sum=sum+a;
			if((a%10)==0){
				System.out.println("1-"+a+" : "+sum);
			}
			a++;
		}while(a<101);
		
	}

}
