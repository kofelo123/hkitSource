package HW2_5;
import java.util.*;
public class HW2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		int sum = 0, i=0, cnt=0, val = 0;
		do{
			i+=3;
			if(num >= i){
				val = i;
				sum += i;
			}
			cnt++;
		}while(num>=i);
		System.out.println("����� �Է� : "+num);
		System.out.println(num+"�� �Ѿ��� ���� �� : "+i);
		System.out.println(num+"�� �Ѿ��� �������� ���հ� : "+sum);
		System.out.println(num+"�� �Ѿ��� ������ �� ��° 3�� ����ΰ� : "+cnt);
	}

}
