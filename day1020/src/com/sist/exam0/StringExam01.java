package com.sist.exam0;

import java.util.Scanner;

public class StringExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mail;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸����� �Է��ϼ���.");
		mail = sc.next();
		
		int i = mail.indexOf("@");
		String s = mail.substring(0,i);
		System.out.println(s);
		
	}

}
