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
			System.out.println(i+"��°���ڸ� �Է��ϼ���.");
			num = sc.nextInt();
			if(num > 0){
				sum += num;
				cnt++;
			}
		}while(i<10);
		avg = (double) sum/cnt;
		System.out.println("��ü�� ���� " + sum);
		System.out.println("����� " + avg);
	}

}
