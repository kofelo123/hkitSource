package report4;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int rank, salary, tax=0;
		int receipt=0;
		
		System.out.println("������ �Է��� �ּ���.");
		System.out.print("==> ");
		salary = scan.nextInt();
		
		System.out.println("������ �Է��� �ּ���.(5~8)");
		System.out.print("==> ");
		rank = scan.nextInt();
		
		if(rank >= 5 && rank < 9){
			if(rank == 7 && rank == 8){
				tax = 8;
				receipt = salary-(salary*tax/100);
			}
			else {
				tax = 12;
				receipt = salary-(salary*tax/100);
			}
		}
		
		System.out.println("\n���� : " + rank + "��");
		System.out.println("���� : " + salary);
		System.out.println("�Ǽ��ɾ�(����"+ tax + "%����) : " + receipt);
		
		
	}

	
}
