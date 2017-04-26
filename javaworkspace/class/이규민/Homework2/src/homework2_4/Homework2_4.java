package homework2_4;

public class Homework2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, sum = 0;
		do
		{
			num++;
			sum += num;
			if(num%10 == 0 && num == 100)
				System.out.println("1-"+num+" : "+sum);
			else if(num%10 == 0 && num != 100)
				System.out.println("1-"+num+" : 0000");
		}while(num<100);
	}

}
