package Chap06;
import java.util.*;
public class Test05 {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("����� �Է�:");
	int x=input.nextInt();
	int y=1;
	int sum=0;
	int a; //�Ѿ��� ���� ��
	int b=0; //���° 3�� ���
	do{
	  if(y%3==0){
		 sum=sum+y;
		 b=b+1;
	  }
		y=y+1;
	}while(y<x);
	b=b+1;
	a=b*3; 
	System.out.println(x+"�� �Ѿ��� ���� ��  :"+a);
	System.out.println(x+"�� �Ѿ��� ���� ���հ�  :"+sum);
	System.out.println(x+"�� �Ѿ��� ������ �� ��° 3�� ��� �ΰ�  :"+b);
	}
}