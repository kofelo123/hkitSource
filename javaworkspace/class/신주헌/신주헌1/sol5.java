package housework;

import java.util.Scanner;

public class sol5 {
	public static void main(String[] args){
		int N=3;
		int i=0;//번째
		int sum=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("사용자 입력:");
		i = scan.nextInt();
		do{
			if(N%3==0){
				sum+=N;
			}
			N+=3;
		}while(N<i);
		System.out.println(i+"을 넘었을때의 값:"+N);
		System.out.println(i+"을 넘었을때의 총합계:"+sum);
//		System.out.println(i+"을 넘었을 때 까지 몇번째 3의 배수인가:");
	}
}
