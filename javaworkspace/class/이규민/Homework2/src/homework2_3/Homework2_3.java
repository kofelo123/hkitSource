package homework2_3;

import java.util.*;

public class Homework2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, sum = 0;
		int count = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		do
		{
			i++;
			System.out.println("10개 중 "+i+"번째 숫자를 입력하시오");
			num = sc.nextInt();
			if(num > 0){
				sum += num;
				count++;
			}
		}while(i<10);
		avg = (double)sum/count;
		System.out.println("합 : "+sum+",  평균 : "+avg);
	}

}
