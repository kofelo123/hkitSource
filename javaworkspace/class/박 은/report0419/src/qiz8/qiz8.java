package qiz8;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class qiz8 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int a;
		int n=1;
		System.out.println("=====================");
		System.out.println("가장 좋아하는 월은?(종료:0)");
		System.out.println("=====================");
		a=sc.nextInt();
		
do{
	
	switch (a) {
	case 12: case 1: case 2:
		System.out.println("****** "+a+"월  ******");	
		System.out.println(a+"월은 겨울에 해당됩니다.");		
		break;
	case 3: case 4: case 5:
		System.out.println("****** "+a+"월  ******");	
		System.out.println(a+"월은 봄에 해당됩니다.");	
		break;
	case 6: case 7: case 8:
		System.out.println("****** "+a+"월  ******");	
		System.out.println(a+"월은 여름에 해당됩니다.");	
		break;
	case 9: case 10: case 11:
		System.out.println("****** "+a+"월  ******");	
		System.out.println(a+"월은 가을에 해당됩니다.");	
		break;
	case 0:
		System.out.println("종료되었습니다");
		break;
	default:
		System.out.println("숫자를 잘못입력하셨습니다.");
		break;
	}
	
	
}while(a<0);
}
}
