package homework1_5;

import java.util.*;

public class Homework1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int time, price, real;
		System.out.println("���ǰ��� �Է��Ͻÿ�");
		price = sc.nextInt();
		System.out.println("������ �ð��� �Է��Ͻÿ�.");
		time = sc.nextInt();
		if(time>24){
			System.out.println("�ð��Է��� �߸��Ǿ����ϴ�.");
			return;
		}
		else if(time<12)
			real = (price*95)/100;
		else
			real = (price*975)/1000;
		System.out.println("���� ���� �ݾ�  :  "+real);
		
	}

}
