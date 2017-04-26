package homework_0419;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		int total=0;
		double avg=0.0;
		int[] arr = new int[10];
		do{	
			
			System.out.print("정수를 입력하시오: ");
			arr[i]=sc.nextInt();
			if(arr[i]>0){
			total += arr[i];
			avg = (double)total/arr.length;
			i++;
			}
		}
		while(i<10);
		
		System.out.println("합은 "+ total);
		System.out.println("평균은" + avg);


	}

}
