package ex;

import java.util.Scanner;

public class Ex7 {
//�񱳿����� >,<,=, and=&&, or=||
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int gender;
		String s;
		int height;
		int weight;
		
		System.out.println("���� : 1.���� 2.���� ");
		/*s=sc.nextLine();*/
		gender=sc.nextInt();
		System.out.println("Ű : ");
		height = sc.nextInt();
		System.out.println("������ : ");
		weight = sc.nextInt();
		
		if(gender==1){
			if((weight-(height-100))<-5){				
				System.out.println("�̴�");
			}else if((weight-(height-100))>=5){
				System.out.println("�ʰ�");
			}else if(5<=(weight-(height-100)) && (weight-(height-100))<5){//&&�־�ؾ��Ѵ�.
				System.out.println("ǥ��");		
			}
		}else if(gender==2){
			if((weight-(height-105))<-5){
				System.out.println("�̴�");
			}else if((weight-(height-105))>=5){
				System.out.println("�ʰ�");
			}else if(5<=(weight-(height-105)) && (weight-(height-105))<5){//&&�־�ؾ��Ѵ�.
				System.out.println("ǥ��");		
			}
		}
		
		/*if(s=="����"){
			if((weight-(height-100))<-5){				
				System.out.println("�̴�");
			}else if((weight-(height-100))>=5){
				System.out.println("�ʰ�");
			}else if(5<=(weight-(height-100)) && (weight-(height-100))<5){//&&�־�ؾ��Ѵ�.
				System.out.println("ǥ��");		
			}
		}else if(s=="����"){
			if((weight-(height-105))<-5){
				System.out.println("�̴�");
			}else if((weight-(height-105))>=5){
				System.out.println("�ʰ�");
			}else if(5<=(weight-(height-105)) && (weight-(height-105))<5){//&&�־�ؾ��Ѵ�.
				System.out.println("ǥ��");		
			}
		}*/
	}

}