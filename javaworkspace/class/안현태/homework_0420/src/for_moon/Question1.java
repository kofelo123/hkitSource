package for_moon;

public class Question1 {

	public static void main(String[] args) {
		int i=0;
		int total=1;
		do{		
			total += i;
			
			if(i==14){
				System.out.print(total+". ");
				break;
			}
			System.out.print(total+", ");
						
			i++;
			
					
		}
		while(i<15);
	}

}
