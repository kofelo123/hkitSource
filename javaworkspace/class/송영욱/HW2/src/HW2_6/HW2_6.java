package HW2_6;
import java.util.*;
public class HW2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� �������� �Է����ּ���.");
		int num = sc.nextInt();
		int i=8;
		System.out.println("������Է� : "+num);
		System.out.println("**"+num+"��**");
		do{
			System.out.println(i+" * "+num+" ="+i*num);
			i-=2;
		}while(i>1);
	}

}
