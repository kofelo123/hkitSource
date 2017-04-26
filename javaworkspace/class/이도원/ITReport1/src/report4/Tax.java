package report4;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int rank, salary, tax=0;
		int receipt=0;
		
		System.out.println("본봉을 입력해 주세요.");
		System.out.print("==> ");
		salary = scan.nextInt();
		
		System.out.println("직급을 입력해 주세요.(5~8)");
		System.out.print("==> ");
		rank = scan.nextInt();
		
		if(rank >= 5 && rank < 9){
			if(rank == 7 && rank == 8){
				tax = 8;
				receipt = salary-(salary*tax/100);
			}
			else {
				tax = 12;
				receipt = salary-(salary*tax/100);
			}
		}
		
		System.out.println("\n직급 : " + rank + "급");
		System.out.println("본봉 : " + salary);
		System.out.println("실수령액(세금"+ tax + "%적용) : " + receipt);
		
		
	}

	
}
