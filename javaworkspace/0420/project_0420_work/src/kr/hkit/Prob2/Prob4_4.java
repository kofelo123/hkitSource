package kr.hkit.Prob2;

public class Prob4_4 {
	
	public static void main(String[] args) {
		
		int sum=0;
		int i=1;
		do{
			if(i%2==1)
				sum+=i;
			else
				sum-=i;
			
			i++;
		}while(sum<=100);
		
		System.out.println(i);
		
		
	}

}
