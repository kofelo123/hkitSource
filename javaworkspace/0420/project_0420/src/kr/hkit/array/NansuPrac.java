package kr.hkit.array;

public class NansuPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int[] nansu=new int[10];
		
		for(int i=0;i<=9;i++){
			nansu[i]=(int)(Math.random()*10);
			System.out.println(nansu[i]);
		}*/
		
		// 배열 0~9 생성
		int[]num = new int[10];
		
		for(int i=0; i<num.length;i++){
			num[i] = i;		
		}
		
		
		
		//temp,난수
		int temp,nan;
		
		
		for(int i=0;i<num.length;i++){//10x10=100번반복			
			for(int j=0;j<num.length;j++){
				temp=0;
				nan=(int)(Math.random()*10);
				
				temp=num[j]; //swap
				num[j]=num[nan];
				num[nan]=temp;
				
			}
		}
		
		//출력
		for(int i=0; i<num.length;i++){
			System.out.print(num[i]);	
		}
		
	}

}
