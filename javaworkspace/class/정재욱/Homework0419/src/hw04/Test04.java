package hw04;

public class Test04 {

	public static void main(String[] args) {
		int total=0, x=1;
		do{
			total=total+x;
			
			if(x%10==0 && x%100 != 0) {
				System.out.printf("1-%d : 0000\n", x);
			} else if(x%100==0) {
				System.out.printf("1-%d : %d\n", x, total);
			}
			x++;
		}while(x<=100);
	}

}
