package com.inter._0518;

public class InterfaceTest2 {
	public static void main(String[] args) {
		A a = new A();
		a.autoPlay(new B(),"KPop");
		a.autoPlay(new C(),"JPop");
	}
}

class A{
	void autoPlay(I i,String songName){
		i.play(songName);
	}
}

interface I{
	public abstract void play(String songName);
}

class B implements I{

	@Override
	public void play(String songName) {
		// TODO Auto-generated method stub
		System.out.println("play in B class -> "+songName);
	}
	
}
class C implements I{
	
	@Override
	public void play(String songName) {
		// TODO Auto-generated method stub
		System.out.println("play in C class -> "+songName);
	}
	
}
