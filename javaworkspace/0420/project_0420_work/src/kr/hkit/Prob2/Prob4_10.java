package kr.hkit.Prob2;

public class Prob4_10 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		for(int i=10; i<=100000; i=i*10){ //10부터 자리수 단위별로 나머지를 구한다.
			if(i>10){
				sum+=(num%i/(i/10));//40,300,2000,10000 에서 0을 없앤다.
				num-=num%i;
			}else
			sum+=num%i;//5
		}
		
		
		System.out.println("sum="+sum);
	}
}
