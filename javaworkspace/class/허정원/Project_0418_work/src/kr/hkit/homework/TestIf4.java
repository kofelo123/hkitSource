package kr.hkit.homework;

import java.util.Scanner;

public class TestIf4 {
	Scanner scanner = new Scanner(System.in);
	String gender;
	int height,weight,index,gap;
	
	
	public void input(){
		System.out.print("������ �´� ���� �Է�(����,����): ");
		gender=scanner.nextLine();
		
		System.out.print("������ �Է����ּ���: ");
		height=scanner.nextInt();
		
		System.out.print("ü���� �Է����ּ���: ");
		weight=scanner.nextInt();
	}
	
	public void health(){		
		
		if(gender.equals("����")){
			index=height-100;//ǥ�ظ�����
			gap=weight-index;//���θ�����-ǥ�ظ����� (��������)
			if(gap<-5){
				System.out.println("���� �̴��Դϴ�."+"(ǥ�ظ�����"+index+"�� ����������="+gap+")");
			}else if(gap>5){
				System.out.println("���� �ʰ��Դϴ�."+"(ǥ�ظ�����"+index+"�� ����������="+gap+")");
				
			}else {
				System.out.println("���� ǥ���Դϴ�."+"(ǥ�ظ�����"+index+"�� ����������="+gap+")");
			}
		
		}else if(gender.equals("����")){
			index=height-105;//ǥ�ظ�����
			gap=weight-index;//���θ�����-ǥ�ظ����� (��������)
			if(gap<-5){
				System.out.println("���� �̴��Դϴ�."+"(ǥ�ظ�����"+index+"�� ����������="+gap+")");
			}else if(gap>5){
				System.out.println("���� �ʰ��Դϴ�."+"(ǥ�ظ�����"+index+"�� ����������="+gap+")");
				
			}else {
				System.out.println("���� ǥ���Դϴ�."+"(ǥ�ظ�����"+index+"�� ����������="+gap+")");
			}
		}
		
		
	}
	
	public void method2(){
		System.out.println("�޼ҵ�2");
	}
	
	
	public static void main(String[] args) {
	
		TestIf4 testIf4 = new TestIf4();
		testIf4.input();
		testIf4.health();
		
	}
}
