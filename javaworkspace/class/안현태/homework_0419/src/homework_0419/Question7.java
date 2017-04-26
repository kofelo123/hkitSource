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
			
			System.out.print("정수를 입력하시오: ");
			arr[i]=sc.nextInt();
			
			if(count%2==0){
				arr[i]=-arr[i];
			}
			total += arr[i];
			i++;
			count++;
			
		}
		while(i<10);
		
		System.out.println("합은 "+ total);
		

	}

}
