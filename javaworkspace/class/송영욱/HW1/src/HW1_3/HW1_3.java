package HW1_3;
import java.util.*;
public class HW1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���ͼ����� �Է��ϼ���");
		String gender = sc.nextLine();
		int toeic = sc.nextInt();
		
		if((gender.charAt(0) == 'F' && toeic >= 700) || (gender.charAt(0) == 'M' && toeic >= 800))
			System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�.");
		sc.close();
	}

}
