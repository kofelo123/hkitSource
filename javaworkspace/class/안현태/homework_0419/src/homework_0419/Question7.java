package homework_0419;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		int total=0;
		int count=1;
		int[] arr = new int[10];
		do{	
			
			System.out.print("������ �Է��Ͻÿ�: ");
			arr[i]=sc.nextInt();
			
			if(count%2==0){
				arr[i]=-arr[i];
			}
			total += arr[i];
			i++;
			count++;
			
		}
		while(i<10);
		
		System.out.println("���� "+ total);
		

	}

}
