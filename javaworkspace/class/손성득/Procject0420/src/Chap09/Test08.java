package Chap09;
import java.util.*;
public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int x;
		do{
			System.out.println("���� �����ϴ� ����?(���� :0)");
			x=input.nextInt();
			if(x==1||x==2||x==3){
					System.out.println(x+ "���� �ܿ￡ �ش��մϴ�");}
			else if(x==4||x==5||x==6){
					System.out.println(x+ "���� ���� �ش��մϴ�");}
			else if(x==7||x==8||x==9){
					System.out.println(x+ "���� ������ �ش��մϴ�");}
			else if(x==10||x==11||x==12){
					System.out.println(x+ "���� ������ �ش��մϴ�");
			}
			else System.out.println("�ٽ��Է��ϼ���");
		}while(x!=0);
		System.out.print("z");
	}

}
