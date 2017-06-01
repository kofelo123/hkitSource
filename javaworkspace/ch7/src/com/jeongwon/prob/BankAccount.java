package com.jeongwon.prob;

public class BankAccount {

	private String name;
	private String accountNum;
	private int money;
	private double interestRate;
	
	public BankAccount(String name,String accountNum,int money,double interestRate) {
		this.name = name;
		this.accountNum = accountNum;
		this.money = money;
		this.interestRate = interestRate;
	}
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
}
