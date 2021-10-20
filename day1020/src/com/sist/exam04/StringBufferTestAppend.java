package com.sist.exam04;

public class StringBufferTestAppend {
	
	public static void pro(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		StringBuffer data = new StringBuffer("hello");
		String msg ="java";
		int year = 2021;
		boolean flag = true;
		
		data.append("/");
		data.append(msg);  //¾î¶² º¯¼ö´ø StringÀ¸·Î ²ø¾î¿È
		data.append("/");
		data.append(year);
		data.append("/");
		data.append(flag);
		
		System.out.println(data);
		
		pro(String.valueOf(data));
		pro(data+"");
		
	}
}
