package com.sist.exam03;

import java.util.Scanner;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.println("문자열을 입력하시오==>");
		a = sc.next();
		
		a = a.replace("hello","안녕");
		System.out.println(a);
		
		
	}

	

}
