package com.jeongwon.threaded;

class Sum{
	int num;
	public Sum(){num=0;}
	public void addNum(int n){num += n;}
	public int getNum() {return num;}
}
class AdderThread extends Thread{
	Sum sumInst;
	int start, end;
	
	public AdderThread(Sum sum,int s, int e){
		sumInst=sum;
		start=s;
		end=e;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=start; i<=end; i++)
			sumInst.addNum(i);
	}
	
}
public class Thread02 {

	public static void main(String[] args) {
		
		Sum s = new Sum();
		AdderThread at1 = new AdderThread(s,1,5000);
		AdderThread at2 = new AdderThread(s,5001,10000);
		
		Thread tr1 = new Thread(at1);
		Thread tr2  = new Thread(at2);
		
		tr1.start();
		tr2.start();
		
		try{
			tr1.join();
			tr2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("1~100±îÁö ÇÕ" + s.getNum());
	}
}
