package com.sist.exam0;

import java.util.Scanner;

public class Resident {
	
	public static void main(String[] args) {
		String res;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��Ͻÿ�.(-����)");
		res = sc.next();
		 int total =0;
		 int result;
		 total += Integer.parseInt(res.substring(0, 1)) * 2;  // �ֹε�� �Ǻ�����  �� = 11-{(2����+3����+4����+5����+6����+7����+8����+9����+2����+3����+4����+5����) mod 11}
		  total += Integer.parseInt(res.substring(1, 2)) * 3;
		  total += Integer.parseInt(res.substring(2, 3)) * 4;
		  total += Integer.parseInt(res.substring(3, 4)) * 5;
		  total += Integer.parseInt(res.substring(4, 5)) * 6;
		  total += Integer.parseInt(res.substring(5, 6)) * 7;
		  total += Integer.parseInt(res.substring(7, 8)) * 8; // 6��°�� -
		  total += Integer.parseInt(res.substring(8, 9)) * 9;
		  total += Integer.parseInt(res.substring(9, 10)) * 2;
		  total += Integer.parseInt(res.substring(10, 11)) * 3;
		  total += Integer.parseInt(res.substring(11, 12)) * 4;
		  total += Integer.parseInt(res.substring(12, 13)) * 5;
		  
		  total %=11;
		  result = 11-total;
		  if(result == Integer.parseInt(res.substring(13, 14))) {
			  System.out.println("�ùٸ� �ֹε�Ϲ�ȣ");
		  }else {
			  System.out.println("�ùٸ��� ���� �ֹε�Ϲ�ȣ");
		  }
		
}
}
