package com.jeongwon.prac;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_14 {

	static ArrayList record = new ArrayList();
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			switch (displayMenu()) {
			case 1:
				inputRecord();
				break;
			case 2:
				displayRecord();
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
			}
		}
	}
	
	static int displayMenu(){
		System.out.println("************************");
		System.out.println("*             ���� ���� ���α׷�        *");
		System.out.println("************************");
		System.out.println();
		System.out.println("1.�л����� �Է��ϱ�");
		System.out.println();
		System.out.println("2.�л����� ����");
		System.out.println();
		System.out.println("3.���α׷� ����");
		System.out.println();
		int menu =0;	
		while(true){
		System.out.print("���ϴ� �޴��� �����ϼ���.(1~3) : ");			
		menu=s.nextInt();
		if((menu>0 && menu<4)){
			return menu;
		}else
			System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		}
	
	}
	
	static void inputRecord(){
		System.out.println("1.�л����� �Է��ϱ�");
		System.out.println("�̸�,��,��ȣ,�����,�����,���м��� �� ������ ������� �Է��ϼ���");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���, ����ȭ������ ���ư��ϴ�.");
		s.nextLine();
		while(true){
			System.out.print(">>");
//			String b = null;int d = 0,e=0,f=0,g=0,h=0;
			
			String a=s.nextLine().trim();	
				
			String [] toColumnNm = a.split(",");
			
			if(a.equals("q")||a.equals("Q"))
				break;
				
		/*	if(toColumnNm.length!=6){
				System.out.println("�Է¿����Դϴ�.�̸�,��,��ȣ,�����,�����,���м��� �� ������ �Է��ϼ���.");
				continue;
			}*/
			
			toColumnNm[1]=Integer.parseInt(toColumnNm);
			
			
			record.add(new Student(b, d, e, f, g, h));
			System.out.println("�� �Է� �Ǿ����ϴ�.");
			System.out.println("��ġ���� q�� �Է����ּ���");
			
		}
		
	}

	static void displayRecord(){
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		
		int length = record.size();
		
		if(length > 0){
			System.out.println();System.out.println("�̸� �� ��ȣ ���� ���� ���� ���� ��� ������� �ݵ��");
			
			System.out.println("=========================================");
			
			for(int i = 0; i < length ; i++){
				Student student = (Student)record.get(i);
				System.out.println(student);
				koreanTotal += student.kor;
				mathTotal += student.math;
				englishTotal+=student.eng;
				total += student.total;
			}
			System.out.println("===================================");
			System.out.println("���� : " + koreanTotal +" "+englishTotal +" " + mathTotal + " " + total);
			System.out.println();
		}else{
			System.out.println("===================================");
			System.out.println("�����Ͱ� �����ϴ�.");
			System.out.println("===================================");
		}
	}
}

class Student implements Comparable{

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total;
	int schoolRank;
	int classRank;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math =math;
		
		total = kor+eng+math;
	}
	
	int getTotal(){
		return total;
	}
	
	float getAverage(){
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Student){
			Student tmp = (Student)o;
			return tmp.total = this.total;
		}else{
			return -1;
		}
		
	}
	
	public String toString(){
		return name +","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage()+","+schoolRank+","+classRank;
	}
	
}