package housework;

import java.util.Scanner;

public class sol6 {
	public static void main(String[] args){
		int i=0;
		int j=8;
		int dan;
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력하세요:");
		i = scan.nextInt();
		System.out.println("**"+i+"단 **");
		do{
			do{
				System.out.println(j+"*"+i+"="+j*i);
				j-=2;
			}while(i<8);
		}while(j>1);
	}
}
