package quiz4;

import java.util.Scanner;

public class quiz4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, gold; int segum;
		System.out.print("직급:");
		a = sc.nextInt();
		if(a==7||a==8){
			System.out.print("본급:");
			gold = sc.nextInt();
			segum = gold-(gold/100*8);
			System.out.print("실수령액(세금8%적용):");
			System.out.println(segum);}
	
		else if(a==5||a==6){
		System.out.print("본급:");
			gold = sc.nextInt();
			segum = gold-(gold/100*12);
			System.out.print("실수령액(세금12%적용):");
			System.out.println(segum);}
			else if(a<5||a>8){
				System.out.println("잘못입력하셧습니다.");

}
}
}
