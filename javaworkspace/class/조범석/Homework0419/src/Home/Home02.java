package Home;

public class Home02 {

	public static void main(String[] args) {
	 int sum=0, i=1;
		
		 do
		 {
		  sum=sum+i;
		  i=i+2;
		 } while(i<100);

		 System.out.println("100~1 까지의 홀수의 합: " +sum);
	}
}
