package com.jeongwon.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserInfo implements java.io.Serializable{
	String name;
	String password;
	int age;
	
	public UserInfo() {
		this("Unknown", "1111",0);
	}
	
	public UserInfo(String name, String password, int age){
		this.name = name;
		this.password = password;
		this.age = age;
		
	}
	
	public String toString(){
		return "(" + name + "," + password +"," + age + ")";
	}

}

class SerialEx1{
	public static void main(String[] args) {
		try{
			String fileName = "UserInfo.ser";
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new  BufferedOutputStream(fos);
			
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("JavaMan","1234",30);
			UserInfo u2 = new UserInfo("JavaWoman","4321",26);
			
			ArrayList<UserInfo> list = new ArrayList<>();
			list.add(u1);
			list.add(u2);
			
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			out.close();
			System.out.println("����ȭ ��");
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
