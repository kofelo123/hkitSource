package kr.hkit.array;

public class NansuPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int[] nansu=new int[10];
		
		for(int i=0;i<=9;i++){
			nansu[i]=(int)(Math.random()*10);
			System.out.println(nansu[i]);
		}*/
		
		// �迭 0~9 ����
		int[]num = new int[10];
		
		for(int i=0; i<num.length;i++){
			num[i] = i;		
		}
		
		
		
		//temp,����
		int temp,nan;
		
		
		for(int i=0;i<num.length;i++){//10x10=100���ݺ�			
			for(int j=0;j<num.length;j++){
				temp=0;
				nan=(int)(Math.random()*10);
				
				temp=num[j]; //swap
				num[j]=num[nan];
				num[nan]=temp;
				
			}
		}
		
		//���
		for(int i=0; i<num.length;i++){
			System.out.print(num[i]);	
		}
		
	}

}
