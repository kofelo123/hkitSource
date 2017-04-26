package quest04;

public class Q4 {

	public static void main(String[] args) {

		int num = 0;
		int total=0;
		do{
			num++;
			total+=num;
									
			if(num%10==0){
				System.out.println("1-"+num+": "+total);
			}
			
		}while(num<=100);
		
	}

}
