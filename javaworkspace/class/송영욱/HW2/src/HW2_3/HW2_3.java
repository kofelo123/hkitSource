package HW2_3;
import java.util.*;
public class HW2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=0, num =0, sum=0, cnt =0;
		double avg = 0.0;
		do{
			i++;
			System.out.println(i+"번째숫자를 입력하세요.");
			num = sc.nextInt();
			if(num > 0){
				sum += num;
				cnt++;
			}
		}while(i<10);
		avg = (double) sum/cnt;
		System.out.println("전체의 합은 " + sum);
		System.out.println("평균은 " + avg);
	}

}
