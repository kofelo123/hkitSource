package com.poly.c0515;

import java.util.Scanner;
//��ü
public class PhoneInfo {
	
	String name;
	String phoneNumber;
	String birth;
	
	
	
	public PhoneInfo(String name, String num, String birth) {
		this.name = name;
		phoneNumber = num;
		this.birth=birth;		
	}
	public PhoneInfo(String name, String num) {
		this.name = name;
		phoneNumber = num;
		this.birth=null;
	}
	public void showPhoneInfo(){
		System.out.println("name: " + name); 
		System.out.println("phone: "+phoneNumber);
		if(birth!=null)
			System.out.println("birth: " + birth);
	}

}

class College extends PhoneInfo{
	String major;
	String grade;
	
	public College(String name,String num,String birth,String major,String grade) {
		super(name,num,birth);
		this.major=major;
		this.grade=grade;
	}
	public void showPhoneInfo(){
		System.out.println("name: " + name);
		System.out.println("phone: "+phoneNumber);
		if(birth!=null)
			System.out.println("birth: " + birth);
		System.out.println("major: "+major);
		System.out.println("grade: "+grade);
	}
}

class Company extends PhoneInfo{
	String companyName;
	
	
	public Company(String name,String num,String birth,String companyName) {
		super(name,num,birth);
		this.companyName=companyName;
		
	}
	
	public void showPhoneInfo(){
		System.out.println("name: " + name);
		System.out.println("phone: "+phoneNumber);
		if(birth!=null)
			System.out.println("birth: " + birth);
		System.out.println("companyName: "+companyName);
	
	}
}


class General extends PhoneInfo{

	
	public General (String name,String num,String birth) {
		super(name,num,birth);	
	}

}
//����
class PhoneBookManager{
	
	private static PhoneBookManager phoneBookManager;
	
	private PhoneBookManager(){
	}
	
	public static PhoneBookManager getInstance(){
		if(phoneBookManager==null)
			phoneBookManager= new PhoneBookManager();
		return phoneBookManager;
		
	}
	
	final int MAX_CNT = 100;
	PhoneInfo[] infoStorage= new PhoneInfo[100];
	int curCnt=0;
	
	public void inputData(int choice2){
		System.out.println("������ �Է���  �����մϴ�..");
		
		System.out.print("�̸�: " );
		String name=MenuViewer.keyboard.nextLine();
		if(search(name)==0){
			System.out.println("�ߺ��� �����Ͱ� �̹� �����մϴ�.�����մϴ�.");
			return;
		}
		System.out.print("��ȭ��ȣ: " );
		String phone=MenuViewer.keyboard.nextLine();
		System.out.print("�������: " );
		String birth=MenuViewer.keyboard.nextLine();
		
		if(choice2==Num2.COLLEAGE){
			System.out.print("�а� : " );
			String major=MenuViewer.keyboard.nextLine();
			System.out.print("�г�: " );
			String grade=MenuViewer.keyboard.nextLine();
			
			infoStorage[curCnt++]=new College(name, phone, birth,major,grade);
			
		}else if(choice2==Num2.GENERAL){
			infoStorage[curCnt++]=new General(name, phone, birth);
		}else if(choice2==Num2.COMPANY){
			System.out.print("ȸ��� : " );
			String companyName=MenuViewer.keyboard.nextLine();
			infoStorage[curCnt++]=new Company(name, phone, birth,companyName);
		}
		
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�. \n");
		
	}
	
	public void searchData(){
		System.out.println("������ �˻��� �����մϴ�.");
		
		System.out.print("�̸�: ");
		String name=MenuViewer.keyboard.nextLine();
		
		int dataIdx=search(name);
		if(dataIdx<0){
			System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�. \n");
		}else{
			infoStorage[dataIdx].showPhoneInfo();
			System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�. \n");
		}
	}
	
	public void deleteData(){
		System.out.println("������ ������ �����մϴ�..");
		
		System.out.print("�̸�: ");
		String name=MenuViewer.keyboard.nextLine();
		int dataIdx=search(name);
		if(dataIdx<0){
			System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�. \n");
		}else{
			for(int idx=dataIdx; idx<(curCnt-1); idx++)
				infoStorage[idx]=infoStorage[idx+1];
			curCnt--;
			System.out.println("������ ������ �Ϸ�Ǿ����ϴ�. \n");
		}
	}
	
	public int search(String name){
		for(int idx=0; idx<curCnt; idx++){
			PhoneInfo curInfo=infoStorage[idx];
			if(name.compareTo(curInfo.name)==0)
					return idx;
		}
		return -1;
	}
	
	
}
//����
class MenuViewer{
	public static Scanner keyboard=new Scanner(System.in);
	
	public static void showMenu0(){
		System.out.println("�����ϼ���..");
		System.out.println("1.����ģ��");
		System.out.println("2.�Ϲ�ģ��");
		System.out.println("3.ȸ��ģ��");
	}
	
	public static void showMenu(){
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. ���α׷� ����");
		System.out.print("����: ");
	}
}
//����
class Client{
	PhoneBookManager manager = PhoneBookManager.getInstance();
	int choice,choice2;
	
	public void excution()throws Menu1Exception,Menu2Exception{
		while(true){
			
			MenuViewer.showMenu();
			choice=MenuViewer.keyboard.nextInt();
			if(choice<1 || choice>4)
				throw new Menu1Exception();
			MenuViewer.keyboard.nextLine();
			
						
			switch(choice){
			case Num1.INPUT:
				MenuViewer.showMenu0();
				choice2=MenuViewer.keyboard.nextInt();
				if(choice2<1 || choice2>3)
					throw new Menu2Exception();
				MenuViewer.keyboard.nextLine();
				manager.inputData(choice2);
				break;
			case Num1.SEARCH:
				manager.searchData();
				break;
			case Num1.DELETE:
				manager.deleteData();
				break;
			case Num1.END:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}

interface Num1{
	int INPUT = 1;
	int SEARCH = 2;
	int DELETE = 3;
	int END = 4;
}
interface Num2{
	int COLLEAGE = 1;
	int GENERAL = 2;
	int COMPANY =3;
}

class Menu1Exception extends Exception {
	public Menu1Exception() {
		super("1~4���� ���� ������ �ֽ��ϴ�.");
		// TODO Auto-generated constructor stub
	}
}

class Menu2Exception extends Exception{
	public Menu2Exception() {
		super("1~3���� ���� ������ �ֽ��ϴ�.");
		// TODO Auto-generated constructor stub
	}
}

class MenuChoiceException extends Exception{
	int wrongChoice;
	
	public MenuChoiceException(int choice) {
		super("�߸����õ� �޴��Դϴ�.");
		wrongChoice = choice;
		
	}
	
}


//test
class PhoneBookVer03{
	public static void main(String[] args) throws Menu1Exception,Menu2Exception{
		
		Client client = new Client();
		client.excution();
		

	}
}