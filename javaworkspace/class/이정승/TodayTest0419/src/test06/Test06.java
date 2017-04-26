package test06;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
	//입력받은 숫자에서 짝수 단만 구구단으로 출력

		Scanner sc = new Scanner(System.in);
		
		int num, i;
		
		num=0;
		i=9;
		
		System.out.println("단을 입력하세요");
		num = sc.nextInt();
		
		System.out.println("**" + num + "단**");
		do{
			if(i%2 == 0){
				System.out.println(i + "*" + num + " = " + i*num);
			}
			i--;
			
		}while(i!=0);
		
	}

}
