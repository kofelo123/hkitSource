package quest07;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=0;
		int i=0; //¦����° Ȯ��
		int total=0;
		int count=1;
		
		do{
			System.out.println("10���� ������ �Է��ϼ���.");
			num=scan.nextInt();
			
			if(count%2==0)
			{
				num=num*(-1);
			}
			count++;
			total+=num;
			i++;
			
		}while(i<=9);
		
		System.out.println("���� : "+ total);
	}

}
