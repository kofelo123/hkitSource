package HW1_2;
import java.util.*;

public class HW1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if((num1 % 2 == 0 && num2 % 2 == 0) || (num1 % 2 != 0 && num2 % 2 != 0))
			System.out.println("�� ���ڴ� ���� ¦�� �Ǵ� Ȧ�� �Դϴ�.");
		
		sc.close();
	}

}
