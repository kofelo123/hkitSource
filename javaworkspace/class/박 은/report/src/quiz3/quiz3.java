package quiz3;

			import java.util.Scanner;
			public class quiz3 {
			public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a, toic;
			System.out.println("������ �������ּ���.");
			System.out.println("1.���� 2.����");
			 a = sc.nextInt();
			 System.out.println(a);
			 if(a==1 || a==2){
			 System.out.println("�����������Է����ּ���.");
			 toic = sc.nextInt();
			 if(a==1&800<toic || a==2&700<toic){System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�.");}
			 else System.out.println("�˼��մϴ�.�װ� �¹��� ���� �ڰ��� �Ұ��� �մϴ�");
				}
			
		}
	}
