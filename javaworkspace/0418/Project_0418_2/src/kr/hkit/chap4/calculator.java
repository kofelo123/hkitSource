package kr.hkit.chap4;

public class calculator {
	
	
	public static void main(String[] args) {
		double radius,circum,area;//������,���ѷ�,������
		
		final double PI=3.141592;		
		radius=4.5; //������
		circum=(radius*2)*PI; //���ѷ�
		area=(radius*radius)*PI; //������
		
		System.out.println("���ѷ� ���ϱ�:"+circum);
		System.out.println("������ ���ϱ�:"+area);
		
		
	}
}
