package report02;

public class Question02 {

	public static void main(String[] args) {
		int i = 100;
		int odd_sum = 0;
		do{
			if(i%2 == 1){
				odd_sum += i;
			}
			i--;
		} while(i >= 1);
		
		System.out.println("100���� 1���� Ȧ���� �� : " + odd_sum);
	}

}
