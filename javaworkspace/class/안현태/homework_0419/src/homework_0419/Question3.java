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
			
			System.out.print("������ �Է��Ͻÿ�: ");
			arr[i]=sc.nextInt();
			if(arr[i]>0){
			total += arr[i];
			avg = (double)total/arr.length;
			i++;
			}
		}
		while(i<10);
		
		System.out.println("���� "+ total);
		System.out.println("�����" + avg);


	}

}
