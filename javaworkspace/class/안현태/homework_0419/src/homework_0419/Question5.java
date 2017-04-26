package homework_0419;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i=0;
		int total=0;
		int count=1;
		int a;
		
		System.out.print("사용자 입력: ");
		a = sc.nextInt();
		do{		
			i+=3;
			if(i>a){
			System.out.println(a+"를 넘었을 때의 값:"+i);
			System.out.println(a+"를 넘었을 때까지의 총합계:"+total);
			System.out.println(a+"를 넘었을 때까지 몇 번째 3의 배수인가:"+count);
			break;
			}
			total += i;
			count++;
			
			
		}
		while(true);
	}

}
