package HW1_5;
import java.util.*;
public class HW1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���Žð��� ���Աݾ��� �Է����ּ���");
		
		int time = sc.nextInt();
		int money = sc.nextInt();
		int pay = 0;
		
		if(time < 12)
			pay = (int) (money*0.95);
		else
			pay = (int) (money*0.975);
		System.out.println("���Խð� : " + time + "��");
		System.out.println("�� ���Աݾ� : " + money);
		System.out.println("���� ���� �ݾ� : "+ pay);
	}

}
