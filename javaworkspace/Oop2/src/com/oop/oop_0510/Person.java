package com.oop.oop_0510;

public class Person {
	
	String name;
	int age;
	int birthday;
	
	public Person(String name,int age,int birthday) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		printInform(name, age, birthday);
	}
	public Person(String name, int age) { // �����ε�
		this.name = name;
		this.age = age;
		printInform(name, age);
	}
	
	
	public void printInform(String name, int age, int birthday){
		System.out.println("�̸�: "+name+" , ����: "+age+" , �������: "+birthday);
	}
	
	public void printInform(String name, int age){ // �����ε�
		System.out.println("�̸�: "+name+" , ����: "+age);
	}
	 
	
	public static void main(String[] args) {
		Person person = new Person("ȫ�浿", 25);
		Person person2 = new Person("ȫ�浿2", 26,909090);
		
				
	}
	
}
