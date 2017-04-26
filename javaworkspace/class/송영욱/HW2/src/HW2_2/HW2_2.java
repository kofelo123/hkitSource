package HW2_2;

public class HW2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum=0;
		do{
			if(i%2 != 0)
				sum+=i;
			i++;
		}while(i<100);
		System.out.println(sum);
	}
	

}
