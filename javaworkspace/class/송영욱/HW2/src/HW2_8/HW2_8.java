package HW2_8;
import java.util.*;
public class HW2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String season = "";
		System.out.println("=====================");
		System.out.println("���� �����ϴ� ����?(����:0)");
		System.out.println("=====================");
		int num = sc.nextInt();
		do{
			System.out.println("*****"+num+"��*****");
			if(num>12 || num == 0){
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
				return;
			}
			if(num>=3 && num<=5)
				season = "��";
			else if(num>=6 && num<=8)
				season = "����";
			else if (num>=9 && num<=11)
				season = "����";
			else
				season = "�ܿ�";
				
			System.out.println(num+"���� "+season+"�� �ش�˴ϴ�.");
		}while(num == 0);
	}

}
