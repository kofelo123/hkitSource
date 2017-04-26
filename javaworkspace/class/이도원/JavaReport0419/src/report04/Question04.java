package report04;

public class Question04 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;

		do{
			i++;
			sum += i;
			if(i%10 == 0){
				System.out.println("1-" + i + " : " + sum);
			}
		}while(i <= 100);
	}
}
