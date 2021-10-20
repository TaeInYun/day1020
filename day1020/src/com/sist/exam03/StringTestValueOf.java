package com.sist.exam03;

public class StringTestValueOf {

	public static void pro(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//위와 같이 어떠한 메소드는 String만 매개변수로 갖는 메소드가 있다고 합시다.
		
		int data = 2021;
		
		//정수형 데이타 data를 갖고 pro를 호출해야하는 상황이라고 가정합시다.
		//pro는 String을 매개변수로 갖기 때문에 바로 호출할 수는 없고
		//data를 String으로 변환해야 합니다.
		//pro(data);
		pro(String.valueOf(data)); //정직하게 String만들기
		pro(data+""); //String 만드는 꼼수(?)
	
	}

}
