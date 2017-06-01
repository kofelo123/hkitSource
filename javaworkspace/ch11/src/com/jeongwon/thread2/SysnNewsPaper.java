package com.jeongwon.thread2;

class NewsPaper{
	String todayNews;
	boolean isTodayNews = false;
	
	public void setTodayNews(String news){
		todayNews = news;
		isTodayNews = true;
		synchronized (this) {
			notifyAll();			
		}
	}
	public String getTodayNews(){
		if(!isTodayNews){ //isTodayNews == false
			synchronized (this) {
			try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		}
		return todayNews;
	}
}

class NewsWriter extends Thread{
	NewsPaper paper;
	public NewsWriter(NewsPaper paper) {
		this.paper = paper;
	}
	@Override
	public void run() {
		paper.setTodayNews("오늘의 기사는 ~~~");
	}
}

class NewsReader extends Thread{
	NewsPaper paper;
	public NewsReader(NewsPaper paper) {
		this.paper = paper;
	}
	@Override
	public void run() {
		System.out.println(paper.getTodayNews());
	}
	
}
public class SysnNewsPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsPaper paper = new NewsPaper();
		NewsReader reader = new NewsReader(paper);
		NewsReader reader2 = new NewsReader(paper);
		NewsWriter writer = new NewsWriter(paper);
		
		reader.start();
		reader2.start();
		writer.start();
		
		try{
			reader.join();
			reader2.join();
 			writer.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		 System.out.println("Main 종료");
	}
}
