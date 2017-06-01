package com.oop.oop_0510;

import java.util.Scanner;

public class PersonData {
	
	
	String name;
	String phoneNum;
	String birthday;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	
	public static void main(String[] args) {
		PersonData personData;
		PersonData [] arrayPerson = new PersonData[10];
		int count=0;
		Scanner scanner = new Scanner(System.in);
		int choose;
		
		while(true){
			System.out.println("선택하세요..");
			System.out.println("1.데이터 입력");
			System.out.println("2.프로그램 종료");
			System.out.print("선택:");
			
			choose=scanner.nextInt();
			
			if(choose==2)
				break;
			if(choose==1){
				personData = new PersonData();
				System.out.println("이름:");
				personData.setName(scanner.next());
				System.out.println("전화번호:");
				personData.setPhoneNum(scanner.next());
				System.out.print("생년월일:");
				personData.setBirthday(scanner.next());
				
				System.out.println("\n 입력된 정보 출력...");
				System.out.println("name: "+personData.getName());
				System.out.println("phoneNum: "+personData.getPhoneNum());
				System.out.println("birthDay: "+personData.getBirthday());
				
				arrayPerson[count]=personData;
				count++;
			}
			
			
				
			
		}
	}


	
	
}
