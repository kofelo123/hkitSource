package homework_0418;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
	int time;
	int price;
	double realmoney;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("���� �ð� :");
	time = sc.nextInt();
	System.out.println("�ѱ� �Աݾ�: ");
	price = sc.nextInt();
	
	if(time < 12)
		realmoney = price *0.95;
	else
		realmoney = price*0.975;
	
	System.out.println("���� ���� �ݾ�: " + realmoney);

	}
}
