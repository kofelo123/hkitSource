package qiz3;

import java.util.Scanner;

public class qiz3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, sum=0,averge, n=0;
		System.out.println("10���� ���ڸ� �Է��ϼ���.");
		do{
			a=sc.nextInt();
			if(a>0){ sum=sum+a;
			n++;				
			}else {
				System.out.println("0���� �۽��ϴ�.");
			}
				}while(n<10);
		averge= sum/n;
		System.out.println("10���Ǽ�����:"+sum);
		System.out.println("10���Ǽ��� ���:"+averge);
	}

}
