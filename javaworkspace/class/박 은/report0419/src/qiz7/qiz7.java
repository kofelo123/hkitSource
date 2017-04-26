package qiz7;

import java.util.Scanner;

public class qiz7 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int a=0;
		int n=0;
		int sum=0;
		System.out.println("숫자를입력하세요.");
		do{		
		a=sc.nextInt();
		n++;
		if(n%2==0){
			if(a>0){
				a=a-2*a;}
			else if(a<0){
					a=a+(2*-a);}
		}
		sum=sum+a;
		}while(n<4);

		System.out.println(sum);
	}

}
