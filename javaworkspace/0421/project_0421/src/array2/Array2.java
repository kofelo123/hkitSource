package array2;

public class Array2 {
	
	public static void main(String[] args) {
		int sum=0,totalkor=0,totalEng=0,totalMath=0;
		int[][] score = {
				{88,66,77},
				{86,80,50},
				{40,50,60},
				{60,70,80},
				{50,60,80}		
		};
		
		System.out.println(" ��ȣ   ��    ��    ��    ��    ��");
		System.out.println("====================");
		for(int i=0; i<score.length;i++){
			System.out.print(" "+(i+1)+"  ");
			for(int j=0;j<score[i].length;j++){
				
				System.out.print(""+score[i][j]+" ");
				
				sum+=score[i][j];
				switch (j) {
				case 0:
					totalkor+=score[i][j];
					break;
				case 1:
					totalEng+=score[i][j];
					break;
				case 2:
					totalMath+=score[i][j];
					break;
				}
			}
			System.out.print(sum+" "+sum/3);
			System.out.println();			
			sum=0;
		}
		System.out.println("====================");
		System.out.println("����  "+totalkor+" "+totalEng+" "+totalMath);
		
		
		
	}
}
