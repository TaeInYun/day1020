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
		System.out.print("이름을 입력하시오");
		name = sc.next();
		System.out.print("주민번호를 입력하시오(-포함)");
		resident = sc.next();
		net = Integer.parseInt(resident.substring(0,2)); // Integer.parseInt String을 int타입으로 변환
		age = (thisYear-(1900+net));
		gender = Integer.parseInt(resident.substring(7,8));
		

		if(age>40 && gender ==1 && thisYear%2==0 && age<50) {
			if(thisYear%2==0 && net%2 ==0){
				System.out.print(name+"님은"+thisYear+" 년도 무료암건진 대상자이며 40세이상 암검진 항목 위암,간암입니다.");
		}else {
			System.out.println(name+"님은"+thisYear+"년도무료암검진대상자가 아닙니다.");
			}
		}
			
		if(age>40 && gender ==2 && thisYear%2==0 && age<50) {
			if(thisYear%2==0 && net%2 ==0){
				System.out.print(name+"님은"+thisYear+" 년도 무료암건진 대상자이며 40세이상 암검진 항목 위암,간암,유방암,자궁암입니다.");
		}else {
			System.out.println(name+"님은"+thisYear+"년도무료암검진대상자가 아닙니다.");
			}
		}
		
		if(age>40 && gender ==1 && thisYear%2==1 && age<50) {
			if(thisYear%2==1 && net%2 ==1){
				System.out.print(name+"님은"+thisYear+" 년도 무료암건진 대상자이며 40세이상 암검진 항목 위암,간암입니다.");
		}else {
			System.out.println(name+"님은"+thisYear+"년도무료암검진대상자가 아닙니다.");
			}
		}
			
		if(age>40 && gender ==2 && thisYear%2==1 && age<50) {
			if(thisYear%2==1 && net%2 ==1){
				System.out.print(name+"님은"+thisYear+"년도 무료암건진 대상자이며 40세이상 암검진 항목 위암,간암,유방암,자궁암입니다.");
		}else {
			System.out.println(name+"님은"+thisYear+"년도무료암검진대상자가 아닙니다.");
			}
		}
		
		if(age>50 && gender ==1 && thisYear%2==0 ) {
			if(thisYear%2==0 && net%2 ==0){
				System.out.print(name+"님은"+thisYear+ " 년도 무료암건진 대상자이며 50세이상 암검진 항목  위암,간암,대장암입니다.");
		}else {
			System.out.println(name+"님은"+thisYear+"년도무료암검진대상자가 아닙니다.");
			}
		}
			
		if(age>50 && gender ==2 && thisYear%2==0 ) {
			if(thisYear%2==0 && net%2 ==0){
				System.out.print(name+"님은"+thisYear+" 년도 무료암건진 대상자이며 50세이상 암검진 항목 위암,간암,대장암,유방암,자궁암입니다.");
		}else {
			System.out.println(name+"님은"+thisYear+"년도무료암검진대상자가 아닙니다.");
			}
		}
		
		if(age>50 && gender ==1 && thisYear%2==1) {
			if(thisYear%2==1 && net%2 ==1){
				System.out.print(name+"님은"+thisYear+" 년도 무료암건진 대상자이며 50세이상 암검진 항목  위암,간암,대장암입니다.");
		}else {
			System.out.println(name+"님은"+thisYear+"년도무료암검진대상자가 아닙니다.");
			}
		}
			
		if(age>50 && gender ==2 && thisYear%2==1) {
			if(thisYear%2==1 && net%2 ==1){
				System.out.print(name+"님은"+thisYear+" 년도 무료암건진 대상자이며 50세이상 암검진 항목 위암,간암,대장암,유방암,자궁암입니다.");
		}else {
			System.out.println(name+"님은"+thisYear+"년도무료암검진대상자가 아닙니다.");
			}
		}
		
		if(age<40) {
			System.out.println(name+"님은"+thisYear+"년도무료암검진대상자가 아닙니다.");
		}
	

}
}