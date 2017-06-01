package com.jeongwon.ch11;

import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");	set.add("alien"); set.add("bat");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("result1 : " + set.subS);
	}
}
