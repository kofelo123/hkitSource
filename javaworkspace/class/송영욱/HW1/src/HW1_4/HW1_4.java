package HW1_4;
import java.util.*;
public class HW1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ް� ������ �Է��ϼ���.");
		int grade = sc.nextInt();
		int pay = sc.nextInt();
		int orgpay = pay;
		int tax = 0;
		
		if(grade == 5 || grade == 6){
			pay *= 0.88;
			tax = 12;
		}
		else if(grade == 7 || grade == 8){
			pay *= 0.92;
			tax = 8;
		}
		System.out.println("���� : " + grade + "��");
		System.out.println("���� : " + orgpay);
		System.out.println("�Ǽ��ɾ�(����"+ tax + "%����) : "+ pay);
	}

}
