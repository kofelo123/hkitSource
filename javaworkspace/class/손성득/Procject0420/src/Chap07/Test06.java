package Chap07;
import java.util.*;
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			System.out.print("������ ��� �ұ�??");
			int x=input.nextInt();
			System.out.println("** " +x+"�� **");
			int y=9;
			
			do{
				if(y%2==0){
					System.out.println(y+ "*" +x+ "=" +y*x);
				}
				y--;
			}while(y>1);
	}

}
