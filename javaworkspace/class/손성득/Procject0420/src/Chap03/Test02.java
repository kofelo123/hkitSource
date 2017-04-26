package Chap03;
import java.util.Scanner;
public class Test02 {

	public static void main(String[] args) {
		// TODO È¦¼öÀÇ ÇÕ
		int x=100;
		int sum=0;	
		do{
			if(x%2!=0){
			sum=sum+x;		
				}
			x=x-1;
		}while(x>=1);
		System.out.println(sum);
		}

}
