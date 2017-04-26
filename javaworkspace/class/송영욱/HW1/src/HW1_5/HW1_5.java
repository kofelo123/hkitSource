package HW1_5;
import java.util.*;
public class HW1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("구매시각과 구입금액을 입력해주세요");
		
		int time = sc.nextInt();
		int money = sc.nextInt();
		int pay = 0;
		
		if(time < 12)
			pay = (int) (money*0.95);
		else
			pay = (int) (money*0.975);
		System.out.println("구입시간 : " + time + "시");
		System.out.println("총 구입금액 : " + money);
		System.out.println("실제 지불 금액 : "+ pay);
	}

}
