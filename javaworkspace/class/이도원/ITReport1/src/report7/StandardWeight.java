package report7;

import java.util.Scanner;

public class StandardWeight {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		double weight, height;
		double standard_weight=0.0;
		char sex;
		String condition="";
		
		
		System.out.print("������ : ");
		weight = scan.nextDouble();
		System.out.print("Ű : ");
		height = scan.nextDouble();
		System.out.print("����[M(m) or F(f)] : ");
		sex = scan.next().charAt(0);
		
		
		if(sex == 'M' || sex == 'm'){
			standard_weight = height - 100;
		}
		else if(sex == 'F' || sex == 'f') {
			standard_weight = height - 105;
		}
		
		
		if(weight < standard_weight-5){
			condition = "�̴��Դϴ�.";
		}
		else if(weight >= standard_weight-5 && weight < standard_weight+5){
			condition = "ǥ���Դϴ�.";
		}
		else {
			condition = "�ʰ��Ͽ����ϴ�.";
		}
		
		System.out.println("���� ����� ���´� " + condition);
	}
}
