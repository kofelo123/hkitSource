package housework;

import java.util.Scanner;

public class sol7 {
	public static void main(String[] args){
		int i=1;
		int num=0;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.print(i+"개의 숫자 입력:");
			num=scan.nextInt();
			i++;
			if(i%2==0){
				if(i<0){
					sum-=num;
				}else if(i>0){
					sum+=(-num);
				}
			}
		}while(i<=10);
		System.out.println("합:"+sum);
	}
}
