package test02;

public class Test02 {

	public static void main(String[] args) {
		
		int sum, i, temp;
		
		i=0;
		sum=0;
		do{
			
			if(i%2 == 1){
				sum = sum + i;
			}
			i++;
			
		}while(i <= 100);
		
		System.out.println("1부터 100까지의 홀수 합은 : " + sum);

	}

}
