package housework;

import java.util.Scanner;

public class sol1 {
	public static void main(String[] args){
		int sum=0;
		int i,n=0;
//		int n=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		n=scan.nextInt();
		i=n;
		do{
			sum+=i;
			i--;
		}while(i>=1);
		
		
//		for(int i=n ;i>=1 ;i--){
//			sum+=i;
//		}
		System.out.println(n+"까지 합:"+sum);
	}
}
