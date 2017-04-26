package homework2_2;

public class Homework2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, sum = 0;
		do
		{
			i++;
			if(i%2 == 1)
				sum += i;
		}while(i<100);
		System.out.println(sum);
	}

}
