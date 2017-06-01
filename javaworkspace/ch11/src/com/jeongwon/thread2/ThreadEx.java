package com.jeongwon.thread2;

public class ThreadEx {
	public static void main(String[] args) {

		ThreadEx_1 tr = new ThreadEx_1();
		ThreadEx_2 tr2 = new ThreadEx_2();
		
		Thread thread = new Thread(tr);
		Thread thread2 = new Thread(tr2);
		thread.start();
		thread2.start();
	}
}

class ThreadEx_1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0; i<10; i++){
			System.out.println("안녕하세요?");
			Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class ThreadEx_2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0; i<10; i++){
			System.out.println("안녕히계세요?");
			Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
