package HW1_6;
import java.util.*;
public class HW1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ް� �ٹ��ð��� �Է��ϼ���");
		int grade = sc.nextInt();
		int worktime = sc.nextInt();
		int timepay1, timepay2;
		timepay1 = 20000;
		timepay2 = 15000;
		int pay = 0;
		
		if(grade == 5 || grade == 6){
			if(worktime <= 40)
				pay = timepay1 * 40;
			else if(worktime > 40)
				pay = (int) ((timepay1*40) + ((worktime-40) * (timepay1*1.5)));
		}
		if(grade == 7 || grade == 8){
			if(worktime <= 40)
				pay = timepay2 * 40;
			else if(worktime > 40)
				pay = (int) ((timepay2*40) + ((worktime-40) * (timepay2*1.5)));
		}
		System.out.println("���� : " + grade + "��");
		System.out.println("�ٹ��ð� : " + worktime);
		System.out.println("�� �޿� : "+ pay);
	}

}
