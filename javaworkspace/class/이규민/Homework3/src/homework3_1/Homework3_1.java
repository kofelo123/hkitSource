package homework3_1;

public class Homework3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		for(int i=0; i<15; i++)
		{
			if(i == 14)
			{
				num += i;
				System.out.println(num);
			}
			else
			{
				num += i;
				System.out.print(num+", ");
			}
		}
	}

}
