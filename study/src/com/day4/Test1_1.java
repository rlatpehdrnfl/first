package com.day4;

import java.util.Scanner;

public class Test1_1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int su;
		String str;
		
		System.out.println("수 입력");
		su = sc.nextInt();
		
		if (su%3==0 && su%4==0) {
			str = "3과 4의 배수입니다";
		}else if (su%3==0) {
			str = "3의 배수입니다";
		}else if (su%4==0) {
			str = "4의 배수입니다";
		}else {
			str = "3과 4의 배수가 아닙니다";
		}
		
		System.out.println(str);
		
		

	}

}
