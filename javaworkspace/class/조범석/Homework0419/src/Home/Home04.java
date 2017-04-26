package Home;

public class Home04 {

	public static void main(String[] args) {
		int i=1, sum=0;

		 do
		 {
		  sum=sum+i;

		  if(i%10==0)
		  {
			  System.out.println("1-"+i+" : "+sum);

		  } 
		  i=i+1;
	 
		 } while(i<=100);
	}
}
