package com.sist.exam02;

import java.util.Scanner;

public class ValidJuminNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumin;
		Scanner sc =new Scanner(System.in);
		System.out.println("주민등록번호를 입력하시오(-을 입력하세요) ==>");
		jumin = sc.next();
		
		int []n = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		// 800101-1234567
		// 인덱스가 6번째는 계산에 참여하지 않아요!
		// 문자열의 길이는 14자
		// 반복실행해야할 인덱스는 12번  ==> i < jumin.length() -1
		
		int sum = 0;
		for(int i=0; i <jumin.length()-1;i++) {
			if(i !=6) {
			sum = sum + Integer.parseInt(jumin.charAt(i)+"") *n[i];
			}
		}
		sum = sum%11;
		sum = 11 - sum;
		if(sum == 10) {
			sum =0;
		}
		if(sum ==11) {
			sum=1;
		}
		int check = Integer.parseInt(jumin.charAt(13) +"");  
		// charAt()의 결과는 char입니다.
		//char를 문자열(String)으로 만들기 위하여 (integer.parseInt는 String을 필요로함 )
		//빈문자 ""으로 더하기 해줍니다.
		//그렇게 만들어진 문자열을 integer.parseInt를 이요하여 정수로 만들수 있음
		
		if(sum == check) {
			System.out.println("올바른 주민등록번호입니다.");
		}else {
			System.out.println("올바른 주민등록번호가 압니다.");
		}
	}

}
