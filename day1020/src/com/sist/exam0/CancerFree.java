package com.sist.exam0;

import java.util.Scanner;  
import java.util.Date;
class Cancerfree
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String name, resident;
		int  age;
		int thisYear;
		int net;
		int gender;
		thisYear = today.getYear()+1900;
		System.out.print("�̸��� �Է��Ͻÿ�");
		name = sc.next();
		System.out.print("�ֹι�ȣ�� �Է��Ͻÿ�(-����)");
		resident = sc.next();
		net = Integer.parseInt(resident.substring(0,2)); // Integer.parseInt String�� intŸ������ ��ȯ
		age = (thisYear-(1900+net));
		gender = Integer.parseInt(resident.substring(7,8));
		

		if(age>40 && gender ==1 && thisYear%2==0 && age<50) {
			if(thisYear%2==0 && net%2 ==0){
				System.out.print(name+"����"+thisYear+" �⵵ ����ϰ��� ������̸� 40���̻� �ϰ��� �׸� ����,�����Դϴ�.");
		}else {
			System.out.println(name+"����"+thisYear+"�⵵����ϰ�������ڰ� �ƴմϴ�.");
			}
		}
			
		if(age>40 && gender ==2 && thisYear%2==0 && age<50) {
			if(thisYear%2==0 && net%2 ==0){
				System.out.print(name+"����"+thisYear+" �⵵ ����ϰ��� ������̸� 40���̻� �ϰ��� �׸� ����,����,�����,�ڱþ��Դϴ�.");
		}else {
			System.out.println(name+"����"+thisYear+"�⵵����ϰ�������ڰ� �ƴմϴ�.");
			}
		}
		
		if(age>40 && gender ==1 && thisYear%2==1 && age<50) {
			if(thisYear%2==1 && net%2 ==1){
				System.out.print(name+"����"+thisYear+" �⵵ ����ϰ��� ������̸� 40���̻� �ϰ��� �׸� ����,�����Դϴ�.");
		}else {
			System.out.println(name+"����"+thisYear+"�⵵����ϰ�������ڰ� �ƴմϴ�.");
			}
		}
			
		if(age>40 && gender ==2 && thisYear%2==1 && age<50) {
			if(thisYear%2==1 && net%2 ==1){
				System.out.print(name+"����"+thisYear+"�⵵ ����ϰ��� ������̸� 40���̻� �ϰ��� �׸� ����,����,�����,�ڱþ��Դϴ�.");
		}else {
			System.out.println(name+"����"+thisYear+"�⵵����ϰ�������ڰ� �ƴմϴ�.");
			}
		}
		
		if(age>50 && gender ==1 && thisYear%2==0 ) {
			if(thisYear%2==0 && net%2 ==0){
				System.out.print(name+"����"+thisYear+ " �⵵ ����ϰ��� ������̸� 50���̻� �ϰ��� �׸�  ����,����,������Դϴ�.");
		}else {
			System.out.println(name+"����"+thisYear+"�⵵����ϰ�������ڰ� �ƴմϴ�.");
			}
		}
			
		if(age>50 && gender ==2 && thisYear%2==0 ) {
			if(thisYear%2==0 && net%2 ==0){
				System.out.print(name+"����"+thisYear+" �⵵ ����ϰ��� ������̸� 50���̻� �ϰ��� �׸� ����,����,�����,�����,�ڱþ��Դϴ�.");
		}else {
			System.out.println(name+"����"+thisYear+"�⵵����ϰ�������ڰ� �ƴմϴ�.");
			}
		}
		
		if(age>50 && gender ==1 && thisYear%2==1) {
			if(thisYear%2==1 && net%2 ==1){
				System.out.print(name+"����"+thisYear+" �⵵ ����ϰ��� ������̸� 50���̻� �ϰ��� �׸�  ����,����,������Դϴ�.");
		}else {
			System.out.println(name+"����"+thisYear+"�⵵����ϰ�������ڰ� �ƴմϴ�.");
			}
		}
			
		if(age>50 && gender ==2 && thisYear%2==1) {
			if(thisYear%2==1 && net%2 ==1){
				System.out.print(name+"����"+thisYear+" �⵵ ����ϰ��� ������̸� 50���̻� �ϰ��� �׸� ����,����,�����,�����,�ڱþ��Դϴ�.");
		}else {
			System.out.println(name+"����"+thisYear+"�⵵����ϰ�������ڰ� �ƴմϴ�.");
			}
		}
		
		if(age<40) {
			System.out.println(name+"����"+thisYear+"�⵵����ϰ�������ڰ� �ƴմϴ�.");
		}
	

}
}