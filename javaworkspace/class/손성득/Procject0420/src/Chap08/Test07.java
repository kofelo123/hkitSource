package Chap08;
import java.util.*;
public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			int x;
			int y=1;
			int sum=0;
			do{
				System.out.print("정수를 입력하세요: ");
				x=input.nextInt();
				if(y%2!=0){
					sum=sum+x;
				}
				else if(y%2==0){
					if(x>=0){
					sum=sum-x;
					}
					else if(x<0){
					sum=sum-x;
					}
				}
				y++;
			}while(y<=10);
		System.out.println("총합 : " + sum);
	}

}
