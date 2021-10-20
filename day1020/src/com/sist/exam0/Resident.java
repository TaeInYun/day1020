package com.sist.exam0;

import java.util.Scanner;

public class Resident {
	
	public static void main(String[] args) {
		String res;
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하시오.(-포함)");
		res = sc.next();
		 int total =0;
		 int result;
		 total += Integer.parseInt(res.substring(0, 1)) * 2;  // 주민등록 판별공식  ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
		  total += Integer.parseInt(res.substring(1, 2)) * 3;
		  total += Integer.parseInt(res.substring(2, 3)) * 4;
		  total += Integer.parseInt(res.substring(3, 4)) * 5;
		  total += Integer.parseInt(res.substring(4, 5)) * 6;
		  total += Integer.parseInt(res.substring(5, 6)) * 7;
		  total += Integer.parseInt(res.substring(7, 8)) * 8; // 6번째는 -
		  total += Integer.parseInt(res.substring(8, 9)) * 9;
		  total += Integer.parseInt(res.substring(9, 10)) * 2;
		  total += Integer.parseInt(res.substring(10, 11)) * 3;
		  total += Integer.parseInt(res.substring(11, 12)) * 4;
		  total += Integer.parseInt(res.substring(12, 13)) * 5;
		  
		  total %=11;
		  result = 11-total;
		  if(result == Integer.parseInt(res.substring(13, 14))) {
			  System.out.println("올바른 주민등록번호");
		  }else {
			  System.out.println("올바르지 않은 주민등록번호");
		  }
		
}
}
