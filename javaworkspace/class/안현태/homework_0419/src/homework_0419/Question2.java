package homework_0419;


public class Question2 {

	public static void main(String[] args) {
		
		System.out.println("정수를 입력하시오: ");
		
		int i=1;
		int total=0;
		do{		
			if(i%2==1)
				total+=i;
			i++;
		}
		while(i<=100);
		
		System.out.println("합은 "+ total);

	}
	
}

