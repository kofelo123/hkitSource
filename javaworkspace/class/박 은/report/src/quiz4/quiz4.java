package quiz4;

import java.util.Scanner;

public class quiz4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, gold; int segum;
		System.out.print("����:");
		a = sc.nextInt();
		if(a==7||a==8){
			System.out.print("����:");
			gold = sc.nextInt();
			segum = gold-(gold/100*8);
			System.out.print("�Ǽ��ɾ�(����8%����):");
			System.out.println(segum);}
	
		else if(a==5||a==6){
		System.out.print("����:");
			gold = sc.nextInt();
			segum = gold-(gold/100*12);
			System.out.print("�Ǽ��ɾ�(����12%����):");
			System.out.println(segum);}
			else if(a<5||a>8){
				System.out.println("�߸��Է��ϼ˽��ϴ�.");

}
}
}
