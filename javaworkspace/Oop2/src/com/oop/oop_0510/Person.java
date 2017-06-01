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
	public Person(String name, int age) { // 오버로딩
		this.name = name;
		this.age = age;
		printInform(name, age);
	}
	
	
	public void printInform(String name, int age, int birthday){
		System.out.println("이름: "+name+" , 나이: "+age+" , 생년월일: "+birthday);
	}
	
	public void printInform(String name, int age){ // 오버로딩
		System.out.println("이름: "+name+" , 나이: "+age);
	}
	 
	
	public static void main(String[] args) {
		Person person = new Person("홍길동", 25);
		Person person2 = new Person("홍길동2", 26,909090);
		
				
	}
	
}
