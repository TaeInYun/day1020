package com.sist.exam04;

public class StringBufferReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer data = new StringBuffer("hello korea");
		//"hello" hi로 변경해봅시다
		//data.replace(0, 5, "hi");
		//System.out.println(data);
		
		String oldString = "hello";
		String newString = "hi";
		
		//data로 부터 oldString의 위치를 알아내 봅시다.
		int start = data.indexOf(oldString);
		
		int end = start +oldString.length();
		
		data.replace(start, end, newString);  //앞에는 oldString이 있는 곳을 나타냄
		System.out.println(data);
	}

}
