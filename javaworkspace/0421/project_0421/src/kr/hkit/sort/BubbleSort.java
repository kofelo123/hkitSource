package kr.hkit.sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] bubble= {3,1,4,2,0};
		int temp=0;
		for(int i=1;i<bubble.length;i++){// �����ļ�Ʈ:n-1
			for(int j=0;j<bubble.length-i;j++){// �迭�� 0�ε������� ��Ʈ����-1ȸ
				
				if(bubble[j]<bubble[j+1]){
					temp=bubble[j+1];
					bubble[j+1]=bubble[j];
					bubble[j]=temp;
					
				}
			
			}
			System.out.print(i+"���� ����:");
				for(int k=0;k<bubble.length;k++)
				System.out.print(bubble[k]);
			System.out.println();
			
		}
		
			System.out.print("��������: ");
		for(int i=0;i<bubble.length;i++){
			System.out.print(bubble[i]+" ");
		}
		
		
	}
}