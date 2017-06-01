package com.jeongwon.prob;

class Tv{
	boolean power;
	int channel;
	
	void power(){
		power =!power;
	}
	void channelUp(){
		++channel;
	}
	void channelDown(){
		--channel;
	}
	
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text){
		if(caption){
			System.out.println(text);
		}
	}
}
public class CaptionTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv captionTv = new CaptionTv();
		captionTv.channel = 10;
		captionTv.channelUp();
		System.out.println(captionTv.channel);
		captionTv.displayCaption("Hello, World");
		captionTv.caption=true;
		captionTv.displayCaption("Hello,World");
	}

}
