package Chap5;
import java.util.*;
public class Test04 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=1;
		int sum=0;
		int y;
		do{
			sum=sum+x;
			if(x%10==0){
				System.out.println("1-" +x+ ":" +sum);

			}
			x=x+1;
		}while(x<=100);
		
	}
}
