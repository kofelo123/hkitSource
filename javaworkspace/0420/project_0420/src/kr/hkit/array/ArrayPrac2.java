package kr.hkit.array;

import java.util.Scanner;

public class ArrayPrac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] kor={70,80,70,80,80,50,60,70,80,70};
		int sum=0;
		for(int i=0; i<kor.length;i++){//length�� ������ 0���� x
			sum+=kor[i];
			
		}
		System.out.println("����:"+sum);
		System.out.println("���:"+sum/kor.length);
		
		
		
		Scanner scanner = new Scanner(System.in);
		int[] input= new int[7];
		int max=0,min=100;
		
		for(int i=0;i<input.length;i++){
			System.out.print("���� �Է����ּ���: ");
			input[i]=scanner.nextInt();
			
			if(input[i]>max) //�ԷµȰ��� max,min�� ���ؼ� �־��ش�.
				max=input[i];
			if(input[i]<min)
				min=input[i];
			
			
		}
		
		System.out.println("�ִ밪��:"+max);
		System.out.println("�ּҰ���:"+min);
		
		
		
		
	}

}