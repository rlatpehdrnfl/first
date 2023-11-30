package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		String str = "";
		
		System.out.print("숫자를 입력하세요");
		num = Integer.parseInt(br.readLine());
		
		
//단일 if문
		if (num%2==0) {
			str = "짝수";
		}
		
		if (num%2!=0) {
			str = "홀수";
		}
				
		System.out.println(num + ":"+ str);
		
//if~else문
		if (num%2==0) {
			str = "짝수";
		}else 
			str = "홀수";
		
		System.out.println(num + ":" + str);
		
		
	}

}
