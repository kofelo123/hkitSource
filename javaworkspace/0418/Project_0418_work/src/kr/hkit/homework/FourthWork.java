package kr.hkit.homework;

import java.util.Scanner;

public class FourthWork {
	Scanner scanner = new Scanner(System.in);
	int grade,money,taxMoney;
	//����,��,������ 
	//final double ����,������
	public void input(){
		System.out.print("�����Է�:");
		grade=scanner.nextInt();
		System.out.println("�����Է�:");
		money=scanner.nextInt();
	}
	
	public void taxPrint(){
		
		System.out.println("����:"+grade);
		System.out.println("����"+money);
		System.out.println("�Ǽ��ɾ�(��������):"+taxCal());
		
		
	}
	public int taxCal(){
		if((grade==7||grade==8)){
			taxMoney=money-(int)(money*0.08);
		}else if((grade==5||grade==6)){
			taxMoney=money-(int)(money*0.12);
		}
		
		return taxMoney;
	}

	public static void main(String[] args) {
		FourthWork fourthWork = new FourthWork();
		fourthWork.input();
		fourthWork.taxPrint();
	}

}
