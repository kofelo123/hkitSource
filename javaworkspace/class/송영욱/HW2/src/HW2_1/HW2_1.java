package HW2_1;
import java.util.*;
public class HW2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���.");
		num=sc.nextInt();
		int sum =0;
		do{
			sum += num;
			num--;
		}while(num > 0);
		System.out.println(sum);
	}

}