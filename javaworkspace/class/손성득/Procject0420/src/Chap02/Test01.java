package Chap02;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요.");
		Scanner go= new Scanner(System.in);
		int x=go.nextInt();
		int sum= x;
		do{
			x=x-1;
		    sum=sum+x;
		}while(x>1);
	    System.out.println(sum);
	}

}
