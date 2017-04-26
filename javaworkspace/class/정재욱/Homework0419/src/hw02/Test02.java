package hw02;

public class Test02 {

	public static void main(String[] args) {
		int x=100, y=1;
		int total =0;
		
		do {
			if(x%2==1) {
				total = total+x;
			}
			x--;
		}while(x>=1);

		System.out.println("100부터 1까지 홀수의 합은 " + total);
	}

}
