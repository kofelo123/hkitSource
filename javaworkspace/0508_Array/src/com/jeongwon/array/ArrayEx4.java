package com.jeongwon.array;

public class ArrayEx4 {

	public static void main(String[] args) {
		
		char[] a = {'A','B'};
		char[] b = {'0','1','2'};
		
		System.out.println(a);
		System.out.println(b);
		
		char[] result = new char[a.length+b.length];
		
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, a.length, b.length);
		System.out.println(result);
		
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println(b);
		
		System.arraycopy(a, 0, b, 2, 1);
		System.out.println(b);
	}
}
