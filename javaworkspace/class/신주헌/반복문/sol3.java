package housework;

import java.util.Scanner;

public class sol3 {
	public static void main(String[] args){
		int i=1;
		int num=0;
		int sum=0;
	    double average =0.0;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.print(i+"���� ���� �Է�:");
			num=scan.nextInt();
			sum+=num;
			average=sum/i;
			i++;
		}while(i<=10);
		if(num>0){
			System.out.println("��ü��:"+sum);
			System.out.println("���:"+average);
		}
	}
}
