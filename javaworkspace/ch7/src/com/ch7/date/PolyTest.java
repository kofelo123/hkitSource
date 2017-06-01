package com.ch7.date;

public class PolyTest {
	public static void main(String[] args) {
		TV t = new CaptionTV();
		CaptionTV ct = new CaptionTV();
		
		System.out.println(t.power);
		t.channelUp();
		System.out.println(t.channel);
		t.channelDown();
		System.out.println(t.channel);
		
		ct.text = "ÀÚ¸·";
	}
}

class TV{
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	void channelUp(){
		++channel;
	}
	void channelDown(){
		--channel;
	}
	
}

class CaptionTV extends TV{
	String text;
	void caption(){
		System.out.println(text);
	}
}