package housework;

import java.util.Scanner;

public class sol3 {
	public static void main(String[] args){
		int i=1;
		int num=0;
		int sum=0;
	    double average =0.0;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.print(i+"개의 숫자 입력:");
			num=scan.nextInt();
			sum+=num;
			average=sum/i;
			i++;
		}while(i<=10);
		if(num>0){
			System.out.println("전체합:"+sum);
			System.out.println("평균:"+average);
		}
	}
}
