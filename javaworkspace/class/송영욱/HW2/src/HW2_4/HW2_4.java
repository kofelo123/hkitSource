package HW2_4;

public class HW2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		int i =1;
		do{
			sum += i;
			
			if(i%10 == 0 && i<91)
				System.out.println("1-"+i+" : 0000");
			else if(i == 100)
				System.out.println("1-"+i+" : "+sum);
			i++;		
		}while(i < 101);
	}

}
