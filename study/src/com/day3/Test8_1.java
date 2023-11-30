package com.day3;

import java.util.Scanner;

import javax.xml.transform.Templates;

public class Test8_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,temp;
		
		System.out.print("세개의 수?");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		if(num1>num2) {
			temp=num1;
			num1=num2;
			num2=temp;
		}
		if(num2>num3) {
			temp=num2;
			num2=num3;
			num3=temp;
		}
		if(num1>num2) {
			temp=num1;
			num1=num2;
			num2=temp;
		}
		
		
		System.out.printf("%d %d %d",num1,num2,num3);
		
	}

}
