package com.sist.exam03;

public class StringTestValueOf {

	public static void pro(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� ���� ��� �޼ҵ�� String�� �Ű������� ���� �޼ҵ尡 �ִٰ� �սô�.
		
		int data = 2021;
		
		//������ ����Ÿ data�� ���� pro�� ȣ���ؾ��ϴ� ��Ȳ�̶�� �����սô�.
		//pro�� String�� �Ű������� ���� ������ �ٷ� ȣ���� ���� ����
		//data�� String���� ��ȯ�ؾ� �մϴ�.
		//pro(data);
		pro(String.valueOf(data)); //�����ϰ� String�����
		pro(data+""); //String ����� �ļ�(?)
	
	}

}
