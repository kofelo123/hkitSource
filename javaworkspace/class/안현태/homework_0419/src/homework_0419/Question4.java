package homework_0419;

public class Question4 {

	public static void main(String[] args) {

		int i=0;
		int total=0;
		
		do{		
			
			i++;
			total += i;			

			if(i%10==0)
				System.out.println("1"+"~"+i+":"+total);
			
		}
		while(i<=100);
		

	}
}
