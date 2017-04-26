package homework_0418;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
	int time;
	int price;
	double realmoney;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("구입 시간 :");
	time = sc.nextInt();
	System.out.println("총구 입금액: ");
	price = sc.nextInt();
	
	if(time < 12)
		realmoney = price *0.95;
	else
		realmoney = price*0.975;
	
	System.out.println("실제 지불 금액: " + realmoney);

	}
}
