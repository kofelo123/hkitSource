package Chap06;
import java.util.*;
public class Test05 {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("사용자 입력:");
	int x=input.nextInt();
	int y=1;
	int sum=0;
	int a; //넘었을 때의 값
	int b=0; //몇번째 3의 배수
	do{
	  if(y%3==0){
		 sum=sum+y;
		 b=b+1;
	  }
		y=y+1;
	}while(y<x);
	b=b+1;
	a=b*3; 
	System.out.println(x+"을 넘었을 때의 값  :"+a);
	System.out.println(x+"을 넘었을 때의 총합계  :"+sum);
	System.out.println(x+"을 넘었을 때까지 몇 번째 3의 배수 인가  :"+b);
	}
}