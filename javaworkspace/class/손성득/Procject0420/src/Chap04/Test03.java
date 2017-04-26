
package Chap04;
import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
			int sum=0;
			int x=10;
			int aver;
			int y;
			
			do{
			System.out.print("숫자를 입력하세요:");
			y=input.nextInt();
			if(y>0){
				sum=sum+y;
				 x=x-1;
					}
			else
		    System.out.println("다시입력하세요");
			}while(x>0);
			System.out.println(sum);
			aver=sum/10;
			System.out.println(aver);
			
		}
	}

